package com.example.docker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageCtrl {
    @GetMapping("/hello")
    public ResponseEntity<String> sayMessage() {
        return ResponseEntity.ok("Hello !  Are you ready for Docker ?");
    }
}
