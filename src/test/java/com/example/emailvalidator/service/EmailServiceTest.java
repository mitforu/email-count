package com.example.emailvalidator.service;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class EmailServiceTest {

    @Test
    public void testUniqueEmails(){
        EmailService service = new EmailService();

        int count = service.identifyUniqueEmails(
                Arrays.asList(
                        "Mitesh.patel@gmail.com",
                        "Mitesh.patel+patel@gmail.com",
                        "Miteshpatel@gmail.com",
                        "Test@test.gmail.com",
                        "Testtest+@test.gmail.com"
                )
        );

        assertThat(count).isEqualTo(3);
    }

}