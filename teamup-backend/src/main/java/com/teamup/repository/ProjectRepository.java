package com.teamup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamup.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
