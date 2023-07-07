package com.yuvrajprojects.projects;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String showPortfolio(Model model) {
        // Set portfolio details
        model.addAttribute("name", "Your Name");
        model.addAttribute("profession", "Your Profession");
        model.addAttribute("bio", "Your Bio");
        
        return "portfolio";
    }
    
    @GetMapping("/projects")
    public String showProjects() {
        return "projects";
    }
    
    @GetMapping("/projects/{projectId}")
    public String showProjectDetails() {
        // Fetch and pass project details to the view
        return "project-details";
    }
}
