package com.vermau2k01.user_service.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class User {
     
    @Id
    private String userId;
    private String userName;
    private String email;
    private String about;
    
    @Transient // It won't save in database
    private List<Rating> ratings = new ArrayList<>();
     
}
