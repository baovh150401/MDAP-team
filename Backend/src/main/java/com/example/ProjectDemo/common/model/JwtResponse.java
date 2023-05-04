package com.example.ProjectDemo.common.model;

import java.util.List;

public class JwtResponse {
    private String token;
    private Long id;
    private String type;
    private String usename;
    private String email;
    private List<String> roles;
    
    public JwtResponse(String token, Long id, String type, String usename, String email, List<String> roles) {
        this.token = token;
        this.id = id;
        this.type = type;
        this.usename = usename;
        this.email = email;
        this.roles = roles;
    }

    public JwtResponse(String token, Long id, String usename, String email, List<String> roles) {
        this.token = token;
        this.id = id;
        this.usename = usename;
        this.email = email;
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getUsename() {
        return usename;
    }
    public void setUsename(String usename) {
        this.usename = usename;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getRoles() {
        return roles;
    }
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
    
}
