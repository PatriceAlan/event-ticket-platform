package com.platform.tickets.services.impl;

import com.platform.tickets.domain.CreateEventRequest;
import com.platform.tickets.domain.entities.Event;
import com.platform.tickets.domain.entities.TicketType;
import com.platform.tickets.domain.entities.User;
import com.platform.tickets.exceptions.UserNotFoundException;
import com.platform.tickets.repositories.EventRepository;
import com.platform.tickets.repositories.UserRepository;
import com.platform.tickets.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final UserRepository userRepository;
    private final EventRepository eventRepository;

    @Override
    public Event createEvent(UUID organizedId, CreateEventRequest event) {
        User organizer = userRepository.findById(organizedId)
                .orElseThrow(() -> new UserNotFoundException(
                        String.format("User with ID '%s' not found", organizedId)
                ));

        List<TicketType> ticketTypesToCreate =  event.getTicketTypes().stream().map(ticketType -> {
            TicketType ticketTypeToCreate = new TicketType();
            ticketTypeToCreate.setName(ticketTypeToCreate.getName());
            ticketTypeToCreate.setPrice(ticketTypeToCreate.getPrice());
            ticketTypeToCreate.setTotalAvailable(ticketType.getTotalAvailable());
            return ticketTypeToCreate;
        }).toList();

        Event eventTocreate = new Event();
        eventTocreate.setName(event.getName());
        eventTocreate.setStart(event.getStart());
        eventTocreate.setEnd(event.getEnd());
        eventTocreate.setVenue(event.getVenue());
        eventTocreate.setSalesStart(event.getSaleStart());
        eventTocreate.setSalesEnd(eventTocreate.getSalesEnd());
        eventTocreate.setStatus(event.getStatus());
        eventTocreate.setOrganizer(organizer);
        eventTocreate.setTicketTypes(ticketTypesToCreate);

        return eventRepository.save(eventTocreate);
    }

    @Override
    public Page<Event> listEventsForOrganizer(UUID organizerId, Pageable pageable) {
        return eventRepository.findByOrganizerId(organizerId, pageable);
    }

}
