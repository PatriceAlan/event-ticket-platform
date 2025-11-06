package com.platform.tickets.mappers;

import com.platform.tickets.domain.dtos.TicketValidationResponseDTO;
import com.platform.tickets.domain.entities.Ticket;
import com.platform.tickets.domain.entities.TicketValidation;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-06T18:57:21+0100",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class TicketValidationMapperImpl implements TicketValidationMapper {

    @Override
    public TicketValidationResponseDTO toTicketValidationResponseDTO(TicketValidation ticketValidation) {
        if ( ticketValidation == null ) {
            return null;
        }

        TicketValidationResponseDTO ticketValidationResponseDTO = new TicketValidationResponseDTO();

        ticketValidationResponseDTO.setTicketId( ticketValidationTicketId( ticketValidation ) );
        ticketValidationResponseDTO.setStatus( ticketValidation.getStatus() );

        return ticketValidationResponseDTO;
    }

    private UUID ticketValidationTicketId(TicketValidation ticketValidation) {
        Ticket ticket = ticketValidation.getTicket();
        if ( ticket == null ) {
            return null;
        }
        return ticket.getId();
    }
}
