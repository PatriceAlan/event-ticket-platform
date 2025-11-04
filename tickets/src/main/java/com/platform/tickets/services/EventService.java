package com.platform.tickets.services;

import com.platform.tickets.domain.CreateEventRequest;
import com.platform.tickets.domain.entities.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizedId, CreateEventRequest event);
    Page<Event> listEventsForOrganizer(UUID organizerId, Pageable pageable);
}
