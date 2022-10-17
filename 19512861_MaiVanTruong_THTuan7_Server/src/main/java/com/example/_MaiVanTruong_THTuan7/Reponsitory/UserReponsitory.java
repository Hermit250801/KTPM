package com.example._MaiVanTruong_THTuan7.Reponsitory;

import com.example._MaiVanTruong_THTuan7.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReponsitory extends JpaRepository<User, Integer> {
    public User findUserByUserName(String userName);
}
