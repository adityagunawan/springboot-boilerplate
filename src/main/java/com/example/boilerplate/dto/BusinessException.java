package com.example.boilerplate.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class BusinessException extends Exception {

    private String code;
    private String message;

    public BusinessException(String code,String message){
        this.code = code;
        this.message = message;
    }
}