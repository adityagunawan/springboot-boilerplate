package com.example.boilerplate.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseDto {
    private String code;
    private Boolean isFilure;
    private String message;

    public ResponseDto(Boolean isFilure, String code, String message) {
        this.code = code;
        this.isFilure = isFilure;
        this.message = message;
    }
}
