package com.platform.tickets.mappers;

import com.platform.tickets.domain.CreateEventRequest;
import com.platform.tickets.domain.CreateTicketTypeRequest;
import com.platform.tickets.domain.dtos.*;
import com.platform.tickets.domain.entities.Event;
import com.platform.tickets.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);

    ListEventTicketTypeResponseDto toDto(TicketType ticketType);

    ListEventResponseDto toListEventResponseDto(Event event);

}
