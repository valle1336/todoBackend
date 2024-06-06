package com.valle1336.demo.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/task")
@CrossOrigin("/localhost:3000")
public class TaskController {

    @GetMapping("/hello")
    String hello() {
        return "Hello World";
    }
    @GetMapping("/secure")
    String secure() {
        return "Hello from Secure endpoint";
    }
}
