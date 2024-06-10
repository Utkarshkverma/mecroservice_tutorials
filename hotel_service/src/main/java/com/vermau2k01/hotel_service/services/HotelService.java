package com.vermau2k01.hotel_service.services;

import java.util.List;

import com.vermau2k01.hotel_service.entities.Hotel;

public interface HotelService {
     
    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel getById(String id);

}
