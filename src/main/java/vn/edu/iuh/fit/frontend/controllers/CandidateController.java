package vn.edu.iuh.fit.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.backend.models.Candidate;
import vn.edu.iuh.fit.backend.repositories.CandidateRepository;

import java.util.List;

@Controller
@RequestMapping("/candidates")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;

    @GetMapping
    public String listCandidates(Model model) {
        List<Candidate> candidates = candidateRepository.findAll();
        model.addAttribute("candidates", candidates);
        return "candidates/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("candidate", new Candidate());
        return "candidates/add";
    }

    @PostMapping("/add")
    public String saveCandidate(@ModelAttribute Candidate candidate) {
        candidateRepository.save(candidate);
        return "redirect:/candidates";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Candidate candidate = candidateRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid candidate ID: " + id));
        model.addAttribute("candidate", candidate);
        return "candidates/edit";
    }

    @PostMapping("/edit/{id}")
    public String updateCandidate(@PathVariable Long id, @ModelAttribute Candidate candidate) {
        candidate.setId(id);
        candidateRepository.save(candidate);
        return "redirect:/candidates";
    }

    @GetMapping("/delete/{id}")
    public String deleteCandidate(@PathVariable Long id) {
        Candidate candidate = candidateRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid candidate ID: " + id));
        candidateRepository.delete(candidate);
        return "redirect:/candidates";
    }
}
