package com.example.ProjectDemo.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProjectDemo.repositories.IAccountRepository;

public class IAccountService {
    
    @Autowired
    IAccountRepository iAccountRepository;
    
    
}
