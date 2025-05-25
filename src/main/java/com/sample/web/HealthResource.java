package com.sample.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Slf4j
public class HealthResource {

    @GetMapping("/")
    public ResponseEntity<String> checkHealth() {
        log.info("Ping.");
        return ResponseEntity.of(Optional.of("Pong."));
    }

}