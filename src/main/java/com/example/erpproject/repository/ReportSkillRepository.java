package com.example.erpproject.repository;

import com.example.erpproject.model.ReportSkill;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ReportSkillRepository extends MongoRepository<ReportSkill, String> {
    List<ReportSkill> findByReportUniqueCode(String reportUniqueCode);
}
