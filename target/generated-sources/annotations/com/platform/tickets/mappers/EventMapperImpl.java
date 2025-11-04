package com.platform.tickets.mappers;

import com.platform.tickets.domain.CreateEventRequest;
import com.platform.tickets.domain.CreateTicketTypeRequest;
import com.platform.tickets.domain.dtos.CreateEventRequestDto;
import com.platform.tickets.domain.dtos.CreateEventResponseDto;
import com.platform.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.platform.tickets.domain.dtos.CreateTicketTypeResponseDto;
import com.platform.tickets.domain.dtos.ListEventResponseDto;
import com.platform.tickets.domain.dtos.ListEventTicketTypeResponseDto;
import com.platform.tickets.domain.entities.Event;
import com.platform.tickets.domain.entities.TicketType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-04T14:34:36+0100",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class EventMapperImpl implements EventMapper {

    @Override
    public CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateTicketTypeRequest createTicketTypeRequest = new CreateTicketTypeRequest();

        createTicketTypeRequest.setName( dto.getName() );
        createTicketTypeRequest.setPrice( dto.getPrice() );
        createTicketTypeRequest.setDescription( dto.getDescription() );
        createTicketTypeRequest.setTotalAvailable( dto.getTotalAvailable() );

        return createTicketTypeRequest;
    }

    @Override
    public CreateEventRequest fromDto(CreateEventRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateEventRequest createEventRequest = new CreateEventRequest();

        createEventRequest.setName( dto.getName() );
        createEventRequest.setStart( dto.getStart() );
        createEventRequest.setEnd( dto.getEnd() );
        createEventRequest.setVenue( dto.getVenue() );
        createEventRequest.setSaleStart( dto.getSaleStart() );
        createEventRequest.setSalesEnd( dto.getSalesEnd() );
        createEventRequest.setStatus( dto.getStatus() );
        createEventRequest.setTicketTypes( createTicketTypeRequestDtoListToCreateTicketTypeRequestList( dto.getTicketTypes() ) );

        return createEventRequest;
    }

    @Override
    public CreateEventResponseDto toDto(Event event) {
        if ( event == null ) {
            return null;
        }

        CreateEventResponseDto createEventResponseDto = new CreateEventResponseDto();

        createEventResponseDto.setId( event.getId() );
        createEventResponseDto.setName( event.getName() );
        createEventResponseDto.setStart( event.getStart() );
        createEventResponseDto.setEnd( event.getEnd() );
        createEventResponseDto.setVenue( event.getVenue() );
        createEventResponseDto.setSalesStart( event.getSalesStart() );
        createEventResponseDto.setSalesEnd( event.getSalesEnd() );
        createEventResponseDto.setStatus( event.getStatus() );
        createEventResponseDto.setTicketTypes( ticketTypeListToCreateTicketTypeResponseDtoList( event.getTicketTypes() ) );
        createEventResponseDto.setCreatedAt( event.getCreatedAt() );
        createEventResponseDto.setUpdatedAt( event.getUpdatedAt() );

        return createEventResponseDto;
    }

    @Override
    public ListEventTicketTypeResponseDto toDto(TicketType ticketType) {
        if ( ticketType == null ) {
            return null;
        }

        ListEventTicketTypeResponseDto listEventTicketTypeResponseDto = new ListEventTicketTypeResponseDto();

        listEventTicketTypeResponseDto.setId( ticketType.getId() );
        listEventTicketTypeResponseDto.setName( ticketType.getName() );
        listEventTicketTypeResponseDto.setPrice( ticketType.getPrice() );
        listEventTicketTypeResponseDto.setDescription( ticketType.getDescription() );
        listEventTicketTypeResponseDto.setTotalAvailable( ticketType.getTotalAvailable() );

        return listEventTicketTypeResponseDto;
    }

    @Override
    public ListEventResponseDto toListEventResponseDto(Event event) {
        if ( event == null ) {
            return null;
        }

        ListEventResponseDto listEventResponseDto = new ListEventResponseDto();

        listEventResponseDto.setId( event.getId() );
        listEventResponseDto.setName( event.getName() );
        listEventResponseDto.setStart( event.getStart() );
        listEventResponseDto.setEnd( event.getEnd() );
        listEventResponseDto.setVenue( event.getVenue() );
        listEventResponseDto.setSalesStart( event.getSalesStart() );
        listEventResponseDto.setSalesEnd( event.getSalesEnd() );
        listEventResponseDto.setStatus( event.getStatus() );
        listEventResponseDto.setTicketTypes( ticketTypeListToListEventTicketTypeResponseDtoList( event.getTicketTypes() ) );

        return listEventResponseDto;
    }

    protected List<CreateTicketTypeRequest> createTicketTypeRequestDtoListToCreateTicketTypeRequestList(List<CreateTicketTypeRequestDto> list) {
        if ( list == null ) {
            return null;
        }

        List<CreateTicketTypeRequest> list1 = new ArrayList<CreateTicketTypeRequest>( list.size() );
        for ( CreateTicketTypeRequestDto createTicketTypeRequestDto : list ) {
            list1.add( fromDto( createTicketTypeRequestDto ) );
        }

        return list1;
    }

    protected CreateTicketTypeResponseDto ticketTypeToCreateTicketTypeResponseDto(TicketType ticketType) {
        if ( ticketType == null ) {
            return null;
        }

        CreateTicketTypeResponseDto createTicketTypeResponseDto = new CreateTicketTypeResponseDto();

        createTicketTypeResponseDto.setId( ticketType.getId() );
        createTicketTypeResponseDto.setName( ticketType.getName() );
        createTicketTypeResponseDto.setPrice( ticketType.getPrice() );
        createTicketTypeResponseDto.setDescription( ticketType.getDescription() );
        createTicketTypeResponseDto.setTotalAvailable( ticketType.getTotalAvailable() );
        createTicketTypeResponseDto.setCreatedAt( ticketType.getCreatedAt() );
        createTicketTypeResponseDto.setUpdatedAt( ticketType.getUpdatedAt() );

        return createTicketTypeResponseDto;
    }

    protected List<CreateTicketTypeResponseDto> ticketTypeListToCreateTicketTypeResponseDtoList(List<TicketType> list) {
        if ( list == null ) {
            return null;
        }

        List<CreateTicketTypeResponseDto> list1 = new ArrayList<CreateTicketTypeResponseDto>( list.size() );
        for ( TicketType ticketType : list ) {
            list1.add( ticketTypeToCreateTicketTypeResponseDto( ticketType ) );
        }

        return list1;
    }

    protected List<ListEventTicketTypeResponseDto> ticketTypeListToListEventTicketTypeResponseDtoList(List<TicketType> list) {
        if ( list == null ) {
            return null;
        }

        List<ListEventTicketTypeResponseDto> list1 = new ArrayList<ListEventTicketTypeResponseDto>( list.size() );
        for ( TicketType ticketType : list ) {
            list1.add( toDto( ticketType ) );
        }

        return list1;
    }
}
