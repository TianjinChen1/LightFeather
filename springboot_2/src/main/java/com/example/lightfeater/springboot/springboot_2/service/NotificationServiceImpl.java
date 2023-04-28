package com.example.lightfeater.springboot.springboot_2.service;

import com.example.lightfeater.springboot.springboot_2.data.Notification;

import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {


    @Override
    public Notification saveNotification(Notification notification) {
        return notification;
    }

}
