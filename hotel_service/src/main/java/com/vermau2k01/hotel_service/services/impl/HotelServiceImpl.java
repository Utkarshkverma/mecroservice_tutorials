package com.vermau2k01.hotel_service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vermau2k01.hotel_service.entities.Hotel;
import com.vermau2k01.hotel_service.exception.ResourceNotFoundException;
import com.vermau2k01.hotel_service.repository.HotelRepository;
import com.vermau2k01.hotel_service.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{


    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
      hotel.setId(UUID.randomUUID().toString());
      return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
       return hotelRepository.findAll();
    }

    @Override
    public Hotel getById(String id) {
       return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel is not found with id : "+id));
    }

}
