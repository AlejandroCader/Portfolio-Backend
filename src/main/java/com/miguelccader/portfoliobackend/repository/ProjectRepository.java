package com.miguelccader.portfoliobackend.repository;

import com.miguelccader.portfoliobackend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository  extends JpaRepository<Project, Long> {
}
