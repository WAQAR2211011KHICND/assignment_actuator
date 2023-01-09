package com.glc.assignment_actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceHealthIndicator implements HealthIndicator{
    
    @Override
    public Health health(){
        try {

            String endpointUrl = "http://localhost:8080/checking1";
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.getForEntity(endpointUrl, String.class);
            return Health.up().build();
        } catch (Exception e) {
            // TODO: handle exception
            return Health.down().build();
        }
    }
}
