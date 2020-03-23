package com.example.emailvalidator.controller;

import com.example.emailvalidator.domain.EmailRequest;
import com.example.emailvalidator.domain.EmailResponse;
import com.example.emailvalidator.service.EmailService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    EmailService emailService;

    public EmailController(
            EmailService emailService
    ){
         this.emailService = emailService;
    }

    @PostMapping(
            value = "/unique/emails/count",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public EmailResponse identifyUniqueEmails(@RequestBody EmailRequest emailRequest){
        return new EmailResponse(emailService.identifyUniqueEmails(emailRequest.getEmails()));
    }
}
