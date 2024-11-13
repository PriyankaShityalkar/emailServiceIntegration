package com.maven.service.impl;

import com.maven.entity.Email;
import com.maven.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService
{
    @Autowired
    public JavaMailSender javaMailSender;

    private final String FROM="priyanka.batch3.codecrafter@gmail.com";
    @Override
    public Email sendMail(Email email)
    {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(email.getFrom());
        simpleMailMessage.setSubject(email.getSubject());
        simpleMailMessage.setText(email.getBody());
        simpleMailMessage.setTo(email.getTo().toString());
        javaMailSender.send(simpleMailMessage);
        return email;
    }
}
