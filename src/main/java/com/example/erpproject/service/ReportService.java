package com.example.erpproject.service;

import com.example.erpproject.model.Report;
import com.example.erpproject.repository.ReportRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class ReportService {

    private final ReportRepository reportRepository;

    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

  
    public Report createReport(Report report) {
        report.setUniqueCode(UUID.randomUUID().toString());
        report.setDateOfReport(LocalDate.now());
        return reportRepository.save(report);
    }

    
    public List<Report> getReportsByUser(String userCode) {
        return reportRepository.findByUserCode(userCode);
    }

   
    public Report updateReport(String id, Report updatedReport) {
        Report existing = reportRepository.findById(id).orElseThrow();
        existing.setReportType(updatedReport.getReportType());
        existing.setActive(updatedReport.isActive());
        return reportRepository.save(existing);
    }

   
    public String deleteReport(String id) {
        Report report = reportRepository.findById(id).orElseThrow();
        report.setActive(false);
        reportRepository.save(report);
        return "Report marked as inactive";
    }
}
