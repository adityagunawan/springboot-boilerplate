package com.example.boilerplate.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class RequestDto {

    @Size(min=3, message = "nama harus lebih dari 3 karakter")
    private String name;

    private String address;
}
