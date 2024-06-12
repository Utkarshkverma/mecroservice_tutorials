package com.vermau2k01.rating_service.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "_rating")
@AllArgsConstructor
@NoArgsConstructor
public class Ratings {
     
    @Id
    private String id;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;

}
