package com.digestV06.controllers;

import com.digestV06.models.VacancyModel;
import com.digestV06.services.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class DigestController {
    @Autowired
    private VacancyService vacancyService;

    @GetMapping("/")
    public String getMainDigestPage(Model model) {
        List<VacancyModel> vacancyModelList = vacancyService.getAllVacancies();
        model.addAttribute("vacancyModels", vacancyModelList);
        return "mainDigestPage";
    }

    @GetMapping("/addVacancy")
    public String getAddVacancyPage() {
        return "addVacancyPage";
    }

    @PostMapping("/addVacancy")
    public String selectAllVacancies(@RequestParam String vacancyName,
                                     @RequestParam String vacancyQualification,
                                     @RequestParam String vacancyObligation,
                                     @RequestParam String vacancyDirector,
                                     @RequestParam String vacancySalary,
                                     @RequestParam String vacancyLocation,
                                     @RequestParam String vacancyAssessment,
                                     @RequestParam String vacancyEndDate) {
        VacancyModel vacancyModel = new VacancyModel(vacancyName,
                vacancyQualification,
                vacancyObligation,
                vacancyDirector,
                vacancySalary,
                vacancyLocation,
                vacancyAssessment,
                vacancyEndDate);
        vacancyService.insertVacancy(vacancyModel);
        return "redirect:/";
    }

    @GetMapping("/moreVacancyInformation/{id}")
    public String getVacancyPage(@PathVariable(value = "id") int id, Model model) {
        VacancyModel vacancyModel = vacancyService.getVacancyById(id);
        model.addAttribute("vacancyName", vacancyModel.getVacancyName());
        List<String> vacancyQualificationsList = Arrays.asList(vacancyModel.getVacancyQualification().split(";"));
        model.addAttribute("vacancyQualifications", vacancyQualificationsList);
        List<String> vacancyObligationsList = Arrays.asList(vacancyModel.getVacancyObligation().split(";"));
        model.addAttribute("vacancyObligations", vacancyObligationsList);
        List<String> vacancyDirectorsList = Arrays.asList(vacancyModel.getVacancyDirector().split(";"));
        model.addAttribute("vacancyDirectors", vacancyDirectorsList);
        model.addAttribute("vacancySalary", vacancyModel.getVacancySalary());
        model.addAttribute("vacancyLocation", vacancyModel.getVacancyLocation());
        List<String> vacancyAssessmentsList = Arrays.asList(vacancyModel.getVacancyAssessment().split(";"));
        model.addAttribute("vacancyAssessments", vacancyAssessmentsList);
        model.addAttribute("endVacancyDate", vacancyModel.getEndVacancyDate());
        model.addAttribute("vacancyId", vacancyModel.getId());
        return "vacancyInformationPage";
    }

    @PostMapping("/moreVacancyInformation/{id}")
    public String deleteVacancy(@PathVariable(value = "id") int id) {
        vacancyService.deleteVacancy(id);
        return "redirect:/";
    }

    @GetMapping("/updateVacancy/{id}")
    public String getUpdateVacancyPage(@PathVariable(value = "id") int id, Model model) {
        model.addAttribute("vacancy", vacancyService.getVacancyById(id));
        return "updateVacancyPage";
    }

    @PostMapping("/updateVacancy/{id}")
    public String doVacancyUpdate(@RequestParam String vacancyName,
                                  @RequestParam String vacancyQualification,
                                  @RequestParam String vacancyObligation,
                                  @RequestParam String vacancyDirector,
                                  @RequestParam String vacancySalary,
                                  @RequestParam String vacancyLocation,
                                  @RequestParam String vacancyAssessment,
                                  @RequestParam String vacancyEndDate,
                                  @PathVariable(value = "id") int id) {
        VacancyModel vacancyModel = new VacancyModel(vacancyName,
                vacancyQualification,
                vacancyObligation,
                vacancyDirector,
                vacancySalary,
                vacancyLocation,
                vacancyAssessment,
                vacancyEndDate);
        vacancyService.updateVacancy(vacancyModel, id);
        return "redirect:/";
    }
}
