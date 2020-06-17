package be.ipeters.pma.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.ipeters.pma.entities.Employee;
import be.ipeters.pma.repository.EmployeeRepository;

@RestController
@RequestMapping("/app-api/employees")
public class EmployeeApiController {
	
	@Autowired
	EmployeeRepository empRepo;

	@GetMapping
	public List<Employee> getEmployees(){
	 return empRepo.findAll();
	}
 }
