package com.valle1336.demo.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "tasks")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String taskTitle;
    private String taskDescription;
    private boolean completed;
    private boolean prioritize;
    private LocalDateTime creationDate;

    public TaskEntity(Long id, boolean completed, boolean prioritize, LocalDateTime creationDate, String taskTitle, String taskDescription) {
        this.id = id;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.creationDate = creationDate;
        this.completed = completed;
        this.prioritize = prioritize;
    }

    public TaskEntity() {

    }
}
