package be.ipeters.pma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import be.ipeters.pma.entities.Employee;
import be.ipeters.pma.entities.Project;
import be.ipeters.pma.repository.EmployeeRepository;
import be.ipeters.pma.repository.ProjectRepository;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	@Autowired
	ProjectRepository proRepo;
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping
	public String displayEmployees(Model model) {
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projects", projects);
		return "projects/list-projects";
	}
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		Project aProject = new Project();
		List<Employee> employees = empRepo.findAll();
		
		model.addAttribute("project", aProject);
		model.addAttribute("allEmployees", employees);
		
		return "projects/new-project";
	}
	
	@PostMapping("/save")
	public String createProject(Project project, @RequestParam List<Long> employees, Model model) {
		proRepo.save(project);
		Iterable<Employee> chosenEmployees = empRepo.findAllById(employees);
		for (Employee emp : chosenEmployees) {
			emp.setProject(project);
			empRepo.save(emp);
		}
		
		
//		use a redirect to prevent duplicate submissions
		return "redirect:/projects/new";
	}

}
