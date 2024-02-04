package com.scaler.TicketMaster.models;

import com.scaler.TicketMaster.models.constants.BaseModel;
import com.scaler.TicketMaster.models.constants.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    private LocalDateTime timeOfBooking;
    private double totalAmount;

    @ManyToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}

/*
        Ticket Show
        1      1
        M      1

        Ticket ShowSeat
        1      M
        M     1


        2 Way Mapping
        User -> Ticket
        Ticket -> User

        1 Way Mapping
        User -> Ticket
 */