package vn.edu.iuh.fit.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.models.Job;
import vn.edu.iuh.fit.backend.repositories.JobRepository;

import java.util.Optional;
@Service
public class JobServices {
    @Autowired
    private JobRepository jobRepository;

    // Create or Update
    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    // Find by ID
    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    // Delete by ID
    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }

    // Get all jobs
    public Iterable<Job> getAllJobs() {
        return jobRepository.findAll();
    }
}
