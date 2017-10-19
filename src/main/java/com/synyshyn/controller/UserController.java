package com.synyshyn.controller;

import com.synyshyn.domain.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/info")
public class UserController {

    @RequestMapping(method = RequestMethod.POST)
    public void saveUser(User user) {
        System.out.println(user);
    }
}
