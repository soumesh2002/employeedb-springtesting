package com.example.employeedemo.employeedb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.emp.entity.Employee")
@ComponentScan("com.emp.repository.EmployeeRepository")
public class EmployeedbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeedbApplication.class, args);
	}
}
