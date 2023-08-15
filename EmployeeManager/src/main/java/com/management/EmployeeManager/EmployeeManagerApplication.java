package com.management.EmployeeManager;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import controller.EmployeeController;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("controller")

public class EmployeeManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerApplication.class, args);
	}

	
}
