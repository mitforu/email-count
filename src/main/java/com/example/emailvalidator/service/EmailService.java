package com.example.emailvalidator.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class EmailService {

    public int identifyUniqueEmails(List<String> emails){

        Set<String> unique = new HashSet<>();

        for (String e: emails){
            StringBuffer sb = new StringBuffer();
            String[] s = e.split("@");
            if(s.length > 1){
                for (char c : s[0].toCharArray()){
                    if(c == '+'){
                        break;
                    }
                    if(c != '.'){
                        sb.append(Character.toLowerCase(c));
                    }
                }
                sb.append("@").append(s[1]);
                unique.add(sb.toString());
            }
        }

        return unique.size();
    }
}
