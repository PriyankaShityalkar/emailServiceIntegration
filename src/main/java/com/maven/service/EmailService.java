package com.maven.service;

import com.maven.entity.Email;
import org.springframework.stereotype.Service;

@Service
public interface EmailService
{
    Email sendMail(Email email);
}
