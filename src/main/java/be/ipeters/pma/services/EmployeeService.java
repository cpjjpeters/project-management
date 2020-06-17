package be.ipeters.pma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.ipeters.pma.entities.Employee;
import be.ipeters.pma.entities.EmployeeProject;
import be.ipeters.pma.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	public Employee save(Employee employee) {
		return empRepo.save(employee);
		
	}
	
	public List<Employee> getAll(){
		return empRepo.findAll();
	}

//	public List<EmployeeProject> employeeProjects(){
//		return empRepo.employeeProjects();
//	}
}
