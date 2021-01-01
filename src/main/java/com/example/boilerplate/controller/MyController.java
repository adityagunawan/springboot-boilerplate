package com.example.boilerplate.controller;

import com.example.boilerplate.dto.BusinessException;
import com.example.boilerplate.dto.RequestDto;
import com.example.boilerplate.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(path = "api/v1")
public class MyController {

    @GetMapping(path = "/test")
    public ResponseDto testResponse(@RequestBody RequestDto request) {
        return new ResponseDto(false, "00", "hello world");
    }

    @GetMapping(path = "/test-exception")
    public ResponseDto testException() throws BusinessException {
        if (true)
            throw new  BusinessException("01", "error gan");

        return new ResponseDto(false, "00", "hello world");
    }

    @GetMapping(path = "/test-validation")
    public ResponseDto testValidation(@Valid @RequestBody RequestDto request) {
        return new ResponseDto(false, "00", "hello world");
    }
}
