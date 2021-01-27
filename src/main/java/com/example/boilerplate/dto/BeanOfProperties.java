package com.example.boilerplate.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("url")
public class BeanOfProperties {
    private String inquiry;

    private String payment;

}
