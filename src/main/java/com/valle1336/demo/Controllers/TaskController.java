package com.valle1336.demo.Controllers;

import com.valle1336.demo.Entities.TaskEntity;
import com.valle1336.demo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/task")
public class TaskController {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }



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

    @PostMapping("/create")
    public TaskEntity createTask(@RequestBody TaskEntity taskEntity) {
        taskEntity.setCreationDate(LocalDateTime.now());
        return taskRepository.save(taskEntity);
    }

}
