package be.ipeters.pma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import be.ipeters.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	@Override
	public List<Employee> findAll();
	
	@Query(nativeQuery=true, value="SELECT e.first_name as firstName, e.last_name as lastName"+
	"FROM employee e"+
	"ORDER BY 3DESC")
	public List<Employee> employeeProjects();
	

}
