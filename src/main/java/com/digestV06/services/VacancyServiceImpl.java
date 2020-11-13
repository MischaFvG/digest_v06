package com.digestV06.services;

import com.digestV06.dao.VacancyDao;
import com.digestV06.models.VacancyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyService {
    @Autowired
    private VacancyDao vacancyDao;

    @Override
    public List<VacancyModel> getAllVacancies() {
        return vacancyDao.getAllVacancies();
    }

    @Override
    public void insertVacancy(VacancyModel vacancyModel) {
        vacancyDao.insertVacancy(vacancyModel);
    }

    @Override
    public VacancyModel getVacancyById(int id) {
        return vacancyDao.getVacancyById(id);
    }

    @Override
    public void updateVacancy(VacancyModel vacancyModel, int id) {
        vacancyDao.updateVacancy(vacancyModel, id);
    }

    @Override
    public void deleteVacancy(int id) {
        vacancyDao.deleteVacancy(id);
    }

}
