package com.bookingservice.bookingservice.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.bookingservice.bookingservice.dao.BookingserviceDao;
import com.bookingservice.bookingservice.dto.BookingDto;
import com.bookingservice.bookingservice.model.entity.BookingInfoEntity;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookingserviceService {

    private final BookingserviceDao bookingserviceDao;

    public Object createBookingObject(BookingDto bookingDto) {

        String roomNumbers = getRoomList(bookingDto.getNumOfRooms());
        long numOfDays = numOfDays(bookingDto.getFromDate(), bookingDto.getToDate());

        int totalAmount = (int) (numOfDays * bookingDto.getNumOfRooms() * 1000);

        BookingInfoEntity booking = BookingInfoEntity.builder().fromDate(Date.valueOf(bookingDto.getFromDate()))
                .toDate(Date.valueOf(bookingDto.getToDate())).aadharNumber(bookingDto.getAadharNumber())
                .numOfRooms(bookingDto.getNumOfRooms()).roomNumber(roomNumbers).roomPrice(totalAmount)
                .transactionId(0).bookedOn(new Date(System.currentTimeMillis())).build();

        bookingserviceDao.save(booking);
        return booking;

    }

    private String getRoomList(int count) {
        Random rand = new Random();
        int upperBound = 100;
        ArrayList<String> numberList = new ArrayList<String>();

        for (int i = 0; i < count; i++) {
            numberList.add(String.valueOf(rand.nextInt(upperBound)));
        }

        return String.join(", ", numberList);
    }

    public long numOfDays(String fromDate, String toDate) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
        LocalDate from = LocalDate.parse(fromDate, formatter);
        LocalDate to = LocalDate.parse(toDate, formatter);

        return ChronoUnit.DAYS.between(from, to);
    }

}
