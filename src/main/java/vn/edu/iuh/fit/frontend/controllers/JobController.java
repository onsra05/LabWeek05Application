package vn.edu.iuh.fit.frontend.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.iuh.fit.backend.repositories.JobRepository;

@Controller
public class JobController {
    @Autowired
    private JobRepository jobRepository;

    @GetMapping("jobs")
    public String ShowJob(Model model) {
        model.addAttribute("jobs", jobRepository.findAll());
        return "candidates/jobs/jobs";
    }

}
