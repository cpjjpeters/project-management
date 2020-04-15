package be.ipeters.pma.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import be.ipeters.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	@Override
	public List<Employee> findAll();

}
