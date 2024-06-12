package com.vermau2k01.rating_service.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vermau2k01.rating_service.entities.Ratings;

public interface RatingRepository extends MongoRepository<Ratings,String>{
    List<Ratings> findByUserId(String userId);
    List<Ratings> findByHotelId(String hotelId);
}
