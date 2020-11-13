package com.digestV06.dao;

import com.digestV06.models.VacancyModel;

import java.util.List;

public interface VacancyDao {

    List<VacancyModel> getAllVacancies();

    void insertVacancy(VacancyModel vacancyModel);

    VacancyModel getVacancyById(int id);

    void updateVacancy(VacancyModel vacancyModel, int id);

    void deleteVacancy(int id);
}
