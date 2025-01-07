package com.bookingservice.bookingservice.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {
    private String fromDate;
    private String toDate;
    private String aadharNumber;
    private int numOfRooms;

}
