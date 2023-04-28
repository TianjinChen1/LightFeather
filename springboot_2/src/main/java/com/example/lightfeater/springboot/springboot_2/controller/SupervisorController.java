package com.example.lightfeater.springboot.springboot_2.controller;


import com.example.lightfeater.springboot.springboot_2.service.SupervisorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SupervisorController {


    private SupervisorService supervisorService;

    public SupervisorController (SupervisorService theSupervisorService){
        supervisorService = theSupervisorService;
    }
    @GetMapping("/supervisors")
    public List<String> getSupervisors() {
        return supervisorService.getSupervisors();
    }




}
