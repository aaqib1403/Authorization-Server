package com.example.AuthorizationServer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class AuthorizationServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServer1Application.class, args);
	}

}
