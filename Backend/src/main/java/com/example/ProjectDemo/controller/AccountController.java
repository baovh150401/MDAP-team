package com.example.ProjectDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectDemo.common.ResultModel;
import com.example.ProjectDemo.models.Account;
import com.example.ProjectDemo.repositories.IAccountRepository;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    IAccountRepository accountRepo;
    
    @GetMapping("/")
	public ResponseEntity<List<Account>> listAllAccount(){
		List<Account> listAccount= accountRepo.findAll();
		if(listAccount.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Account>>(listAccount, HttpStatus.OK);
	}

    @PostMapping("/add")
    public ResponseEntity<ResultModel> addAccount(@RequestBody Account account){
        ResultModel result;
        account.setLast_login(new java.util.Date());
        account.setCreated_on(new java.util.Date());
        Account acc = accountRepo.save(account);
        result = new ResultModel(null, "Fail", false, 0);
        if (acc != null){
            result = new ResultModel(null, "Success", true, 0);
        }    
        return ResponseEntity.ok(result);
    }
}
