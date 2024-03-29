package com.scaler.TicketMaster.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookTicketRequestDTO {
    private List<Integer> showSeatIds;
    private Integer userId;
}

