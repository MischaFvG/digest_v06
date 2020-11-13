package com.digestV06.models;

public class VacancyModel {
    private int id;
    private String vacancyName;
    private String vacancyQualification;
    private String vacancyObligation;
    private String vacancyDirector;
    private String vacancySalary;
    private String vacancyLocation;
    private String vacancyAssessment;
    private String endVacancyDate;

    public VacancyModel() {
    }

    public VacancyModel(String vacancyName, String vacancyQualification, String vacancyObligation, String vacancyDirector, String vacancySalary, String vacancyLocation, String vacancyAssessment, String endVacancyDate) {
        this.vacancyName = vacancyName;
        this.vacancyQualification = vacancyQualification;
        this.vacancyObligation = vacancyObligation;
        this.vacancyDirector = vacancyDirector;
        this.vacancySalary = vacancySalary;
        this.vacancyLocation = vacancyLocation;
        this.vacancyAssessment = vacancyAssessment;
        this.endVacancyDate = endVacancyDate;
    }

    public VacancyModel(int id, String vacancyName, String vacancyQualification, String vacancyObligation, String vacancyDirector, String vacancySalary, String vacancyLocation, String vacancyAssessment, String endVacancyDate) {
        this.id = id;
        this.vacancyName = vacancyName;
        this.vacancyQualification = vacancyQualification;
        this.vacancyObligation = vacancyObligation;
        this.vacancyDirector = vacancyDirector;
        this.vacancySalary = vacancySalary;
        this.vacancyLocation = vacancyLocation;
        this.vacancyAssessment = vacancyAssessment;
        this.endVacancyDate = endVacancyDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVacancyName() {
        return vacancyName;
    }

    public void setVacancyName(String vacancyName) {
        this.vacancyName = vacancyName;
    }

    public String getVacancyQualification() {
        return vacancyQualification;
    }

    public void setVacancyQualification(String vacancyQualification) {
        this.vacancyQualification = vacancyQualification;
    }

    public String getVacancyObligation() {
        return vacancyObligation;
    }

    public void setVacancyObligation(String vacancyObligation) {
        this.vacancyObligation = vacancyObligation;
    }

    public String getVacancyDirector() {
        return vacancyDirector;
    }

    public void setVacancyDirector(String vacancyDirector) {
        this.vacancyDirector = vacancyDirector;
    }

    public String getVacancySalary() {
        return vacancySalary;
    }

    public void setVacancySalary(String vacancySalary) {
        this.vacancySalary = vacancySalary;
    }

    public String getVacancyLocation() {
        return vacancyLocation;
    }

    public void setVacancyLocation(String vacancyLocation) {
        this.vacancyLocation = vacancyLocation;
    }

    public String getVacancyAssessment() {
        return vacancyAssessment;
    }

    public void setVacancyAssessment(String vacancyAssessment) {
        this.vacancyAssessment = vacancyAssessment;
    }

    public String getEndVacancyDate() {
        return endVacancyDate;
    }

    public void setEndVacancyDate(String endVacancyDate) {
        this.endVacancyDate = endVacancyDate;
    }

    @Override
    public String toString() {
        return "VacancyModel{" +
                "id=" + id +
                ", vacancyName='" + vacancyName + '\'' +
                ", vacancyQualification='" + vacancyQualification + '\'' +
                ", vacancyObligation='" + vacancyObligation + '\'' +
                ", vacancyDirector='" + vacancyDirector + '\'' +
                ", vacancySalary='" + vacancySalary + '\'' +
                ", vacancyLocation='" + vacancyLocation + '\'' +
                ", vacancyAssessment='" + vacancyAssessment + '\'' +
                ", endVacancyDate='" + endVacancyDate + '\'' +
                '}';
    }
}
