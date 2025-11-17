package com.example.erpproject.service;

import com.example.erpproject.model.ReportSkill;
import com.example.erpproject.repository.ReportSkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportSkillService {

    private final ReportSkillRepository reportSkillRepository;

    public ReportSkillService(ReportSkillRepository reportSkillRepository) {
        this.reportSkillRepository = reportSkillRepository;
    }

    public ReportSkill createSkill(ReportSkill skill) {
        return reportSkillRepository.save(skill);
    }

    public List<ReportSkill> getSkillsByReport(String uniqueCode) {
        return reportSkillRepository.findByReportUniqueCode(uniqueCode);
    }

    public ReportSkill updateSkill(String id, ReportSkill updated) {
        ReportSkill existing = reportSkillRepository.findById(id).orElseThrow();
        existing.setSkillName(updated.getSkillName());
        existing.setRating(updated.getRating());
        existing.setOutOfRating(updated.getOutOfRating());
        return reportSkillRepository.save(existing);
    }

    public String deleteSkill(String id) {
        ReportSkill skill = reportSkillRepository.findById(id).orElseThrow();
        skill.setActive(false);
        reportSkillRepository.save(skill);
        return "Report Skill marked as inactive";
    }
}
