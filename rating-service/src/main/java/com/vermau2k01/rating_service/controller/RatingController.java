package com.vermau2k01.rating_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermau2k01.rating_service.entities.Ratings;
import com.vermau2k01.rating_service.services.RatingService;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

     @Autowired
     private RatingService ratingService;
     
     @PostMapping
     public ResponseEntity<Ratings> createRatings(@RequestBody Ratings ratings)
     {
         Ratings rating = ratingService.createRatings(ratings);
         return new ResponseEntity<>(rating, HttpStatus.CREATED);
     }

     @GetMapping
     public ResponseEntity<List<Ratings>> getRatings()
     {
        return new ResponseEntity<>(ratingService.getRatings(),HttpStatus.FOUND);
     }

     @GetMapping("/users/{userId}")
     public ResponseEntity<List<Ratings>> getRatingsByUserId(@PathVariable String userId)
     {
        return new ResponseEntity<>(ratingService.getRatingsByUserId(userId),HttpStatus.FOUND);
     }

     @GetMapping("/hotels/{hotelId}")
     public ResponseEntity<List<Ratings>> getRatingsByHotelId(@PathVariable String hotelId)
     {
        return new ResponseEntity<>(ratingService.getRatingsByHotelId(hotelId),HttpStatus.FOUND);
     }

}
