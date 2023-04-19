package com.example.ProjectDemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.ProjectDemo.models.Account;

@RepositoryRestResource
public interface IAccountRepository extends JpaRepository<Account, Long>{
	//todo
}