package com.apiratelimit.ratelimiter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping(value = "/api/v1/area/rectangle")
    public ResponseEntity<String> rectangle() {
            Integer length = 5;
            Integer width = 5;
            Integer area = length * width;
            return ResponseEntity.ok("Area of rectangle = " + area);
        }

    @GetMapping(value = "/api/v1/area/triangle")
    public ResponseEntity<String> triangle() {
            Integer height = 5;
            Integer base = 5;
            Integer area = (base * height) / 2;
            return ResponseEntity.ok("Area of rectangle = " + area);
        }
}

