package com.vermau2k01.user_service.services;

import com.vermau2k01.user_service.entities.User;
import java.util.List;

public interface UserServices {

    User saveUser(User user);
    User findUserById(String id);
    List<User> getAllUser();
    boolean delete(String id);
    User updateUser(String id, User user);
} 


