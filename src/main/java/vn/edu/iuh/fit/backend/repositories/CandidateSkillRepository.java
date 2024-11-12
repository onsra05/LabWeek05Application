package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backend.models.CandidateSkill;
import vn.edu.iuh.fit.backend.models.CandidateSkillId;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillId> {
}