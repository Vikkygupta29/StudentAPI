package com.example.erpproject.repository;

import com.example.erpproject.model.Report;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ReportRepository extends MongoRepository<Report, String> {
    List<Report> findByUserCode(String userCode);
    Report findByUniqueCode(String uniqueCode);
}
