package com.learn.aws.demo.student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "StudentController")
@RequestMapping("/student")
public class StudentController {
  @GetMapping("/getStudents")
  ResponseEntity<String[]> getStudents() {
    String[] students = new String[] {"Raja", "Kirti"};
    return new ResponseEntity<>(students, HttpStatus.OK);
  }
}
