package com.example.demo.repository;


import com.example.demo.entity.User;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public List<User> findAll() {
        // backend calling here findAll();
        return null;
    }
}
