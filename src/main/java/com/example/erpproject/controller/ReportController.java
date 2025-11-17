package com.example.erpproject.controller;

import com.example.erpproject.model.Report;
import com.example.erpproject.service.ReportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @PostMapping
    public Report createReport(@RequestBody Report report) {
        return reportService.createReport(report);
    }

    @GetMapping("/user/{userCode}")
    public List<Report> getReportsByUser(@PathVariable String userCode) {
        return reportService.getReportsByUser(userCode);
    }

    @PutMapping("/{id}")
    public Report updateReport(@PathVariable String id, @RequestBody Report updatedReport) {
        return reportService.updateReport(id, updatedReport);
    }

    @DeleteMapping("/{id}")
    public String deleteReport(@PathVariable String id) {
        return reportService.deleteReport(id);
    }
}
