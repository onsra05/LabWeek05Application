package vn.edu.iuh.fit.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/")
    public String showDashboard(Model model) {
        model.addAttribute("title", "Admin Dashboard");
        return "candidates/admin/dashboard";
    }
}
