package com.example._MaiVanTruong_THTuan7.service;

import com.example._MaiVanTruong_THTuan7.Reponsitory.UserReponsitory;
import com.example._MaiVanTruong_THTuan7.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserReponsitory userReponsitory;

    public User registerUser(User user) {
        return userReponsitory.save(user);
    }

    public User findUserByUserName(User user) {
        return userReponsitory.findUserByUserName(user.getUserName());
    }
}
