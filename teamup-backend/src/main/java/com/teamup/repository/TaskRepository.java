package com.teamup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamup.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
