package com.vermau2k01.hotel_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vermau2k01.hotel_service.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
