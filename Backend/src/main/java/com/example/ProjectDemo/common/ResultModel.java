package com.example.ProjectDemo.common;

import java.util.List;

public class ResultModel {
    private List<Object> Data;
    private String Message;
    private Boolean Status; 
    private int StatusCode;

    public ResultModel(List<Object> data, String message, Boolean status, int statusCode){
        this.Data = data;
        this.Message = message;
        this.Status = status;
        this.StatusCode = statusCode;
    }


    public List<Object> getData() {
        return this.Data;
    }

    public void setData(List<Object> Data) {
        this.Data = Data;
    }

    public String getMessage() {
        return this.Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public Boolean isStatus() {
        return this.Status;
    }

    public Boolean getStatus() {
        return this.Status;
    }

    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public int getStatusCode() {
        return this.StatusCode;
    }

    public void setStatusCode(int StatusCode) {
        this.StatusCode = StatusCode;
    }
    
}
