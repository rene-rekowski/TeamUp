package com.teamup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.teamup.model.Project;
import com.teamup.repository.ProjectRepository;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "http://localhost:4200") 
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

//    @GetMapping
//    public List<Project> getAllProjects() {
//        return projectRepository.findAll();
//    }
    @GetMapping
    public List<Project> getAllProjects() {
        return List.of(
            new Project(1L, "Frontend Integration Test", null, List.of()),
            new Project(2L, "Backend Setup", null, List.of())
        );
    }


    @GetMapping("/{id}")
    public Project getProject(@PathVariable Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectRepository.deleteById(id);
    }
    
}
