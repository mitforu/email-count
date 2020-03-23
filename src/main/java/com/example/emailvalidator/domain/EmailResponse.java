package com.example.emailvalidator.domain;

public class EmailResponse {
    int uniqueEmails;

    public EmailResponse(int uniqueEmails) {
        this.uniqueEmails = uniqueEmails;
    }

    public int getUniqueEmails() {
        return uniqueEmails;
    }

    public void setUniqueEmails(int uniqueEmails) {
        this.uniqueEmails = uniqueEmails;
    }
}
