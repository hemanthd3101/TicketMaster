package com.scaler.TicketMaster.service;

import com.scaler.TicketMaster.exception.ShowSeatAlreadyBookedException;
import com.scaler.TicketMaster.models.Ticket;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TicketService {
    @Transactional(isolation = Isolation.SERIALIZABLE)
    Ticket bookTicket(List<Integer> showSeatIds, int userId) throws ShowSeatAlreadyBookedException;
}
