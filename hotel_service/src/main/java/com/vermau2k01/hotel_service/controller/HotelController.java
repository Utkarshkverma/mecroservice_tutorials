package com.vermau2k01.hotel_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermau2k01.hotel_service.entities.Hotel;
import com.vermau2k01.hotel_service.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;
    

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
    {
        Hotel hotel1 = hotelService.create(hotel);
        return new ResponseEntity<>(hotel1,HttpStatus.CREATED);
    }

    @GetMapping("/{hotel_Id}")
    public ResponseEntity<Hotel> getHotel(@PathVariable("hotel_Id") String id)
    {
        Hotel hotel  = hotelService.getById(id);
        return new ResponseEntity<>(hotel, HttpStatus.FOUND);
    }
    
    @GetMapping
    public ResponseEntity<List<Hotel>> getAll()
    {
        return new ResponseEntity<>(hotelService.getAll(),HttpStatus.FOUND);
    }

}
