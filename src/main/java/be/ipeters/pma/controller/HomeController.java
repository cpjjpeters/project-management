package be.ipeters.pma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import be.ipeters.pma.entities.Project;
import be.ipeters.pma.repository.ProjectRepository;

@Controller
public class HomeController {
	
	@Autowired
	ProjectRepository proRepo;
	
	@GetMapping("/")
	public String displayHome(Model model) {
//		Iterable<Project> projects = proRepo.findAll(); //standard, but then we define a List in the Repository
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projectsList",projects);
		return "home";
	}

}
