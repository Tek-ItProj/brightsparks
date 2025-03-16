package com.brightsparks.backend.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {


    // make registration generate hash
    public boolean validateUser(String name, String password) {
        return name.equalsIgnoreCase("student@school.com")
                && password.equalsIgnoreCase("password");
    }


}
