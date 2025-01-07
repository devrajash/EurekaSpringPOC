package com.bookingservice.bookingservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookingservice.bookingservice.model.entity.BookingInfoEntity;

public interface BookingserviceDao extends JpaRepository<BookingInfoEntity, Integer> {

}
