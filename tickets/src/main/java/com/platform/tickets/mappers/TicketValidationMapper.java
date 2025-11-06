package com.platform.tickets.mappers;

import com.platform.tickets.domain.dtos.TicketValidationResponseDTO;
import com.platform.tickets.domain.entities.TicketValidation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TicketValidationMapper {

    @Mapping(target = "ticketId", source = "ticket.id")
    TicketValidationResponseDTO toTicketValidationResponseDTO(TicketValidation ticketValidation);


}
