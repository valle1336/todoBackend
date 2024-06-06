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
    private String task;
    private boolean completed;
    private boolean prioritize;
    private LocalDateTime creationDate;

    public TaskEntity(Long id, String task, boolean completed, boolean prioritize) {
        this.id = id;
        this.task = task;
        this.completed = completed;
        this.prioritize = prioritize;
    }

    public TaskEntity() {

    }
}
