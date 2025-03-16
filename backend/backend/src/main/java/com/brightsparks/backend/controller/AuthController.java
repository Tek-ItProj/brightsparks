package com.brightsparks.backend.controller;

import com.brightsparks.backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    LoginService loginService;

    @PostMapping(value = "/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password){

        boolean isValidUser = loginService.validateUser(username, password);

        if (!isValidUser) {
            //model.put("errorMessage", "Access Denied , Invalid Credentials");
            return new ResponseEntity<>("login", HttpStatus.UNAUTHORIZED);

        }

        /*model.put("name", name);
        model.put("password", password);*/

        return new ResponseEntity<>("welcome", HttpStatus.OK);

    }

}
