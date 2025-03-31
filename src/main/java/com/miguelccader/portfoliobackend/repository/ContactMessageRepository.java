package com.miguelccader.portfoliobackend.repository;

import com.miguelccader.portfoliobackend.model.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}
