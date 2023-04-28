package com.example.lightfeater.springboot.springboot_2.controller;



import com.example.lightfeater.springboot.springboot_2.data.Notification;
import com.example.lightfeater.springboot.springboot_2.service.NotificationService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class NotificationController {


    @Autowired
    private NotificationService notificationService;


    @Autowired

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    @PostMapping("/submit")
    public ResponseEntity<?> addNotification(@Valid @RequestBody Notification request, BindingResult result) {
        // Check for validation errors
        if (result.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            result.getFieldErrors().forEach(e -> errors.put(e.getField(), e.getDefaultMessage()));
            return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
        }




        // Save notification to database
        Notification notification = new Notification(request.getFirstName(), request.getLastName(), request.getEmail(),
                request.getPhone_Number(), request.getSupervisor());

        // Print notification details to console
        System.out.println(notification.toString());
        return new ResponseEntity<>(Collections.singletonMap("message", "Notification added successfully"), HttpStatus.OK);

    }

}
