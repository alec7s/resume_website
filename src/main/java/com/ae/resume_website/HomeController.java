package com.ae.resume_website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
        return "home";
    }

    @RequestMapping("/resume")
    public String resumePage(){
        return "resume";
    }

    @RequestMapping("projects")
    public String projectsPage(){
        return "projects";
    }

    @RequestMapping("contact")
    public String messagePage(){
        return "contact";
    }
}
