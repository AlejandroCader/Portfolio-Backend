package com.miguelccader.portfoliobackend.service;

import com.miguelccader.portfoliobackend.model.ContactMessage;
import com.miguelccader.portfoliobackend.repository.ContactMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactMessageService {
    private final ContactMessageRepository repository;
    public ContactMessage saveMessage(ContactMessage message){
        return repository.save(message);
    }
}
