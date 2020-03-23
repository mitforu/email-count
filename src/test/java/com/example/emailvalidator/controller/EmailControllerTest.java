package com.example.emailvalidator.controller;

import com.example.emailvalidator.domain.EmailRequest;
import com.example.emailvalidator.domain.EmailResponse;
import com.example.emailvalidator.service.EmailService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class EmailControllerTest {

    EmailController controller;

    EmailService emailService;

    @BeforeEach
    public  void init() {
        emailService = mock(EmailService.class);
        controller = new EmailController(emailService);
    }

    @Test
    public void identifyUniqueEmailsTest(){

        when(emailService.identifyUniqueEmails(any())).thenReturn(1);

        List<String> emails = Arrays.asList("test@gmail.com");
        EmailRequest emailRequest = new EmailRequest(emails);
        EmailResponse emailResponse = controller.identifyUniqueEmails(emailRequest);

        verify(emailService, times(1)).identifyUniqueEmails(emails);

        assertThat(emailResponse).isEqualToComparingFieldByField(new EmailResponse(1));
    }

}