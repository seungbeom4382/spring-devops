package com.sh.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @Value("${profile.value}")
    private String value;

    @GetMapping("/")
    public ResponseEntity<?> home(){
        return ResponseEntity.ok("현재 profile은 %s입니다.".formatted(value));
    }

}
