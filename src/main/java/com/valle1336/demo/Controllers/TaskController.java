package com.valle1336.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/task")
public class TaskController {

    //Test
    @GetMapping("/hello")
    String hello() {
        return "Hello World";
    }
    //Test
    @GetMapping("/secure")
    String secure() {
        return "Hello from Secure endpoint!!";
    }

}
