// src/main/java/com/example/taskapp/repository/TaskRepository.java

package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
