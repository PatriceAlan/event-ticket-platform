package com.platform.tickets.domain.dtos;

import com.platform.tickets.domain.entities.TicketValidationStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketValidationResponseDTO {

    private UUID ticketId;
    private TicketValidationStatusEnum status;
}
