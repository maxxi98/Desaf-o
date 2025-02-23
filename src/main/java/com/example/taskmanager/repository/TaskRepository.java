package com.example.taskmanager.repository;

import com.example.taskmanager.models.Task;
import com.example.taskmanager.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(Status status);
}
