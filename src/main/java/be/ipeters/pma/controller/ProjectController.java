package be.ipeters.pma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import be.ipeters.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	@RequestMapping("/new")
	public String displayProjectForm(Model model) {
		Project aProject = new Project();
		model.addAttribute("project", aProject);
		
		return "new-project";
	}

}
