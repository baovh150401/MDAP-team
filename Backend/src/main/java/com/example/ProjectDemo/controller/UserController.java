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

import com.example.ProjectDemo.common.model.ResultModel;
import com.example.ProjectDemo.models.User;
import com.example.ProjectDemo.repositories.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;
    
    @GetMapping("/")
	public ResponseEntity<List<User>> listAllAccount(){
		List<User> listUser= userRepository.findAll();
		if(listUser.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(listUser, HttpStatus.OK);
	}

    @PostMapping("/add")
    public ResponseEntity<ResultModel> addAccount(@RequestBody User user){
        ResultModel result;
        User acc = userRepository.save(user);
        result = new ResultModel(null, "Fail", false, 0);
        if (acc != null){
            result = new ResultModel(null, "Success", true, 0);
        }    
        return ResponseEntity.ok(result);
    }
}
