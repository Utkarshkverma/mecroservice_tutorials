package com.vermau2k01.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vermau2k01.user_service.entities.User;

public interface UserRepository extends JpaRepository<User,String>{

}
