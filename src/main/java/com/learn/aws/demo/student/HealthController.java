package com.learn.aws.demo.student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "HealthController")
@RequestMapping("/health")
public class HealthController {
  @GetMapping
  ResponseEntity<String> getHealth() {
    return new ResponseEntity<>("Success", HttpStatus.OK);
  }
}
