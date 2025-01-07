package com.bookingservice.bookingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookingservice.bookingservice.dto.BookingDto;
import com.bookingservice.bookingservice.service.BookingserviceService;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequiredArgsConstructor
public class BookingServiceController {
    private final BookingserviceService bookingserviceService;

    @GetMapping("/")
    public Map<String, String> getMethodName() {
        Map<String, String> map = new HashMap<>();
        map.put("msg", "Okay");
        return map;
    }

    @PostMapping("/hotel/booking")
    public Object bookRoom(@RequestBody BookingDto bookingDto) {
        Object booking = bookingserviceService.createBookingObject(bookingDto);
        return booking;
    }

}
