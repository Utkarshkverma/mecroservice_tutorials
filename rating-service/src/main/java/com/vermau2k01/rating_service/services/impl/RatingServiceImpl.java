package com.vermau2k01.rating_service.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vermau2k01.rating_service.entities.Ratings;
import com.vermau2k01.rating_service.repositories.RatingRepository;
import com.vermau2k01.rating_service.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService{

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Ratings createRatings(Ratings rating) {
       return ratingRepository.save(rating);
    }

    @Override
    public List<Ratings> getRatings() {
       return ratingRepository.findAll();
    }

    @Override
    public List<Ratings> getRatingsByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Ratings> getRatingsByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }

}
