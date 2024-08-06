package com.example.employeedemo.employeedb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.emp.entity.Employee;
import com.emp.repository.EmployeeRepository;

@SpringBootTest
class EmployeedbApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void testSavedEmployees() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Ethan Hunt");
		employee.setDepartment("Engineering");
		employee.setSalary(90000.00);

		Employee savedEmployee = employeeRepository.save(employee);
		assertNotNull(savedEmployee);
		assertEquals("Engineering", savedEmployee.getDepartment());
	}
}
