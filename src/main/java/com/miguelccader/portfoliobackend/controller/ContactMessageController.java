package com.miguelccader.portfoliobackend.controller;

import com.miguelccader.portfoliobackend.model.ContactMessage;
import com.miguelccader.portfoliobackend.service.ContactMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ContactMessageController {
    private final ContactMessageService contactMessageService;

    @PostMapping
    public ResponseEntity<ContactMessage> receiveMessage(@RequestBody ContactMessage message){
        ContactMessage savedMessage = contactMessageService.saveMessage(message);
        return ResponseEntity.ok(savedMessage);
    }
}
