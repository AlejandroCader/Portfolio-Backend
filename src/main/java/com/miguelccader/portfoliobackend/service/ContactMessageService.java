package com.miguelccader.portfoliobackend.service;

import com.miguelccader.portfoliobackend.model.ContactMessage;
import com.miguelccader.portfoliobackend.repository.ContactMessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactMessageService {
    private final ContactMessageRepository repository;
    public ContactMessage saveMessage(ContactMessage message){
        return repository.save(message);
    }

    public ContactMessageService (ContactMessageRepository repository){
        this.repository = repository;
    }

    public List<ContactMessage> getAllMessages(){
        return repository.findAll();
    }
}
