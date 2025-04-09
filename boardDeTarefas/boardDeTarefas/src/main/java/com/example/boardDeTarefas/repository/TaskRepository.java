package com.example.boardDeTarefas.repository;

import com.example.boardDeTarefas.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
