package com.vermau2k01.rating_service.services;


import java.util.List;

import com.vermau2k01.rating_service.entities.Ratings;

public interface RatingService {

    Ratings createRatings(Ratings rating);

    List<Ratings> getRatings();

    List<Ratings> getRatingsByUserId(String userId);

    List<Ratings> getRatingsByHotelId(String hotelId);

}
