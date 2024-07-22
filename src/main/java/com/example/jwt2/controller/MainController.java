package com.example.jwt2.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String mainP() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        String authority = SecurityContextHolder.getContext().getAuthentication().getAuthorities().iterator().next().getAuthority();
        Object credentials = SecurityContextHolder.getContext().getAuthentication().getCredentials();
        return "main Controller: name%s, password%s, authority%s".formatted(name, authority, credentials);


    }


}
