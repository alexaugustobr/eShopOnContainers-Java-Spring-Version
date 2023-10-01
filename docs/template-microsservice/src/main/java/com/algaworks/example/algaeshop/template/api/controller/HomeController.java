package com.algaworks.example.algaeshop.template.api.controller;

import com.algaworks.example.algaeshop.template.api.model.HelloMessageModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class HomeController {

    @GetMapping("/")
    public HelloMessageModel hello() {
        return HelloMessageModel.builder()
                .id(UUID.randomUUID())
                .message("Hello!")
                .build();
    }

}
