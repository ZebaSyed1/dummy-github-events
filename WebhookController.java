package co.sa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {
    @PostMapping("/webhook")
    public void handleWebhookEvent(@RequestBody String payload) {
        // Parse the payload and process the webhook event
    }
}
