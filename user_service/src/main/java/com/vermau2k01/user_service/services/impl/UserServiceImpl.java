package com.vermau2k01.user_service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vermau2k01.user_service.entities.User;
import com.vermau2k01.user_service.exceptions.ResourceNotFoundException;
import com.vermau2k01.user_service.repository.UserRepository;
import com.vermau2k01.user_service.services.UserServices;

@Service
public class UserServiceImpl implements UserServices{
    
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }
    
    @Override
    public User findUserById(String id) {
        return userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User doesn't exist with id: "+id));
    }
    
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
public boolean delete(String id) {
    userRepository.deleteById(id);
    return !userRepository.existsById(id);
}

@Override
public User updateUser(String id, User user) {
    User existingUser = userRepository.findById(id)
    .orElseThrow(() -> new ResourceNotFoundException("User not found with ID " + id));
        existingUser.setUserName(user.getUserName() != null || !user.getUserName().trim().equals("")?user.getUserName():existingUser.getUserName());
        existingUser.setEmail(user.getEmail() != null || !user.getEmail().trim().equals("")?user.getEmail():existingUser.getEmail());
        existingUser.setAbout(user.getAbout() != null || !user.getAbout().trim().equals("")?user.getAbout():existingUser.getAbout());
        return saveUser(existingUser);
}

}
