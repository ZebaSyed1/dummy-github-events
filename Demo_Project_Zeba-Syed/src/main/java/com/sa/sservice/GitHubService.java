package com.sa.sservice;

import java.net.http.HttpHeaders;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.Value;

@Service
public class GitHubService {

    @Autowired
    private PayloadProcessor payloadProcessor;

    public void processWebhookEvent(String payload) {
        payloadProcessor.processPayload(payload);
        // Add any other business logic here
    }
}

