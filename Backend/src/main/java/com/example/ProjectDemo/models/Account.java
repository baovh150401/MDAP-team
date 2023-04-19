package com.example.ProjectDemo.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String username;
    private String password;
    private String email;
    private Date created_on;
    private Date last_login;

    public Account() {}

    public Account(String username, String password, String email, Date created_on, Date last_login) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.created_on = created_on;
        this.last_login = last_login;
    }

    public Long getAccount_id() {
        return user_id;
    }

    public void setAccount_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Long getUser_id() {
        return this.user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Date getCreated_on() {
        return this.created_on;
    }

    public void setCreated_on(java.util.Date date) {
        this.created_on = date;
    }

    public Date getLast_login() {
        return this.last_login;
    }

    public void setLast_login(java.util.Date date) {
        this.last_login = date;
    }

}