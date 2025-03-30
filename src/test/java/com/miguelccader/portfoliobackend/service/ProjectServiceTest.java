package com.miguelccader.portfoliobackend.service;

import com.miguelccader.portfoliobackend.model.Project;
import com.miguelccader.portfoliobackend.repository.ProjectRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class ProjectServiceTest {

    @Mock
    private ProjectRepository projectRepository;

    @InjectMocks
    private ProjectService projectService;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetProjectById(){

        Project project = new Project();

        project.setId(1L);
        project.setName("Proyecto de Ejemplo");
        project.setDescription("Descripción");
        project.setLink("http://example.com");
        project.setCreatedAt(LocalDate.of(2025, 3, 10));

        when(projectRepository.findById(1L)).thenReturn(Optional.of(project));

        Project foundProject = projectService.getProjectById(1L);

        assertNotNull(foundProject);
        assertEquals(project.getId(), foundProject.getId());
        assertEquals(project.getName(), foundProject.getName());
    }
}
