package com.example.jwt2.controller;

import com.example.jwt2.dto.JoinDto;
import com.example.jwt2.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public String joinProcess(JoinDto joinDto) {
        System.out.println("joinDto.getUsername() = " + joinDto.getUsername());
        joinService.joinProcess(joinDto);
        return "ok";
    }

}
