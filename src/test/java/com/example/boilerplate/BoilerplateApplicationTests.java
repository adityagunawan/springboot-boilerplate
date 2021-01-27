package com.example.boilerplate;

import com.example.boilerplate.dto.BeanOfProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoilerplateApplicationTests {

	@Autowired
	BeanOfProperties beanOfProperties;

	@Test
	void contextLoads() {
	}

	@Test
	void testProperties() {
		System.out.println("this is value of url properties : " + beanOfProperties.toString());
	}

}
