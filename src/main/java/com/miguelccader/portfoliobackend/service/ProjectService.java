package com.miguelccader.portfoliobackend.service;

import com.miguelccader.portfoliobackend.exception.ResourceNotFoundException;
import com.miguelccader.portfoliobackend.model.Project;
import com.miguelccader.portfoliobackend.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    public Project getProjectById(Long id){
        return projectRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Project not found with id " + id));
    }

    public Project createProject(Project project){
        return projectRepository.save(project);
    }

    public Project updateProject(Long id, Project projectDetails){

        Project project = getProjectById(id);
        project.setName(projectDetails.getName());
        project.setDescription(projectDetails.getDescription());
        project.setLink(projectDetails.getLink());

        return projectRepository.save(project);
    }

    public void deleteProject(Long id){
        Project project = getProjectById(id);
        projectRepository.deleteById(id);
    }
}
