package com.example.idgeneratordemo.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UuidKeyGeneratorService implements KeyGeneratorService {
    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
