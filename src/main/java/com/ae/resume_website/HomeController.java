package com.ae.resume_website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String resumePage(){
        return "resume";
    }

    @RequestMapping("about")
    public String projectsPage(){
        return "about";
    }
}
