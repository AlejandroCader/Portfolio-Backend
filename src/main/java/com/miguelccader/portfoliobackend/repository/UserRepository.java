package com.miguelccader.portfoliobackend.repository;

import com.miguelccader.portfoliobackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
