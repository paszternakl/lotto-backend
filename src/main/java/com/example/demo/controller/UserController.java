package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @GetMapping()
    public ResponseEntity<List<User>> findAllUser() {
        //mocking data
/*        List<User> userList = new ArrayList();
        User user1 = new User(1L, "LottoOtto");
        User user2 = new User(2L, "LottoTomi");
        User user3 = new User(3L, "LottoKaresz");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);*/
        return new ResponseEntity(userService.findAllUser(), HttpStatus.OK);
    }

}
