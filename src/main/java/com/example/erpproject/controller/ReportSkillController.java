package com.example.erpproject.controller;

import com.example.erpproject.model.ReportSkill;
import com.example.erpproject.service.ReportSkillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/report-skills")
public class ReportSkillController {

    private final ReportSkillService reportSkillService;

    public ReportSkillController(ReportSkillService reportSkillService) {
        this.reportSkillService = reportSkillService;
    }

    @PostMapping
    public ReportSkill createSkill(@RequestBody ReportSkill skill) {
        return reportSkillService.createSkill(skill);
    }

    @GetMapping("/report/{uniqueCode}")
    public List<ReportSkill> getSkillsByReport(@PathVariable String uniqueCode) {
        return reportSkillService.getSkillsByReport(uniqueCode);
    }

    @PutMapping("/{id}")
    public ReportSkill updateSkill(@PathVariable String id, @RequestBody ReportSkill updated) {
        return reportSkillService.updateSkill(id, updated);
    }

    @DeleteMapping("/{id}")
    public String deleteSkill(@PathVariable String id) {
        return reportSkillService.deleteSkill(id);
    }
}
