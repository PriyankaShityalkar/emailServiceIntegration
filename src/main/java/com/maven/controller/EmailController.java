package com.maven.controller;

import com.maven.entity.Email;
import com.maven.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController
{
    @Autowired
    public EmailService emailService;
    @PostMapping("/simple-mail-send")
    public Email sendMail(@RequestBody Email email)
    {
        return emailService.sendMail(email);
    }


}
