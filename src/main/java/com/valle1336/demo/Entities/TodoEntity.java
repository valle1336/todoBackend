package com.valle1336.demo.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tasks")
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String task;
    private boolean completed;
    private boolean prioritize;

    public TodoEntity(Long id, String task, boolean completed, boolean prioritize) {
        this.id = id;
        this.task = task;
        this.completed = completed;
        this.prioritize = prioritize;
    }

    public TodoEntity() {

    }
}
