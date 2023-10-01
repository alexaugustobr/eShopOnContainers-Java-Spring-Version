package com.algaworks.example.algaeshop.template.api.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class HelloMessageModel {
    private UUID id;
    private String message;
}
