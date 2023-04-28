package com.example.lightfeater.springboot.springboot_2.service;


import com.example.lightfeater.springboot.springboot_2.data.Supervisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupervisorServiceImpl implements SupervisorService{

    private static final String API_URL = "https://o3m5qixdng.execute-api.us-east-1.amazonaws.com/api/managers";

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public List<String> getSupervisors() {
        Supervisor[] supervisors = restTemplate.getForObject(API_URL, Supervisor[].class);

        return Arrays.stream(supervisors)
                .filter(supervisor -> !supervisor.getJurisdiction().matches("\\d+"))
                .sorted(Comparator.comparing(Supervisor::getJurisdiction)
                        .thenComparing(Supervisor::getLastName)
                        .thenComparing(Supervisor::getFirstName))
                .map(supervisor -> String.format(
                        "%s - %s, %s",
                        supervisor.getJurisdiction().replaceAll("\\d+", ""),
                        supervisor.getLastName(),
                        supervisor.getFirstName()))
                .collect(Collectors.toList());
    }
}
