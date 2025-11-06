package com.platform.tickets.services;

import com.platform.tickets.domain.entities.QrCode;
import com.platform.tickets.domain.entities.Ticket;

public interface QrCodeService {

    QrCode generateQrCode(Ticket ticket);

}
