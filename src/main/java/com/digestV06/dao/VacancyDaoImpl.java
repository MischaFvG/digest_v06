package com.digestV06.dao;

import com.digestV06.mappers.VacancyMapper;
import com.digestV06.models.VacancyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VacancyDaoImpl implements VacancyDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<VacancyModel> getAllVacancies() {
        String sqlQuery = "SELECT * FROM vacancy.vacancies ORDER BY id DESC";
        return jdbcTemplate.query(sqlQuery, new VacancyMapper());
    }

    @Override
    public void insertVacancy(VacancyModel vacancyModel) {
        String sqlQuery = "insert into vacancy.vacancies(VACANCY_NAME," +
                "VACANCY_QUALIFICATION," +
                "VACANCY_OBLIGATION," +
                "VACANCY_DIRECTOR," +
                "VACANCY_SALARY," +
                "VACANCY_LOCATION," +
                "VACANCY_ASSESSMENT," +
                "VACANCY_END_DATE)\n" +
                "  values(?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?,\n" +
                "  ?)";
        jdbcTemplate.update(sqlQuery,
                vacancyModel.getVacancyName(),
                vacancyModel.getVacancyQualification(),
                vacancyModel.getVacancyObligation(),
                vacancyModel.getVacancyDirector(),
                vacancyModel.getVacancySalary(),
                vacancyModel.getVacancyLocation(),
                vacancyModel.getVacancyAssessment(),
                vacancyModel.getEndVacancyDate());
    }

    @Override
    public VacancyModel getVacancyById(int id) {
        String sqlQuery = "SELECT * FROM vacancy.vacancies WHERE id=?";
        return jdbcTemplate.queryForObject(sqlQuery, new Object[]{id}, new VacancyMapper());
    }

    @Override
    public void updateVacancy(VacancyModel vacancyModel, int id) {
        String sqlQuery = "UPDATE vacancy.vacancies \n" +
                "SET VACANCY_NAME = ?,\n" +
                "VACANCY_QUALIFICATION = ?,\n" +
                "VACANCY_OBLIGATION = ?,\n" +
                "VACANCY_DIRECTOR = ?,\n" +
                "VACANCY_SALARY = ?,\n" +
                "VACANCY_LOCATION = ?,\n" +
                "VACANCY_ASSESSMENT = ?,\n" +
                "VACANCY_END_DATE = ? \n" +
                "WHERE id = ?";
        jdbcTemplate.update(sqlQuery,
                vacancyModel.getVacancyName(),
                vacancyModel.getVacancyQualification(),
                vacancyModel.getVacancyObligation(),
                vacancyModel.getVacancyDirector(),
                vacancyModel.getVacancySalary(),
                vacancyModel.getVacancyLocation(),
                vacancyModel.getVacancyAssessment(),
                vacancyModel.getEndVacancyDate(),
                id);
    }

    @Override
    public void deleteVacancy(int id) {
        String sqlQuery = "DELETE FROM vacancy.vacancies WHERE id=?";
        jdbcTemplate.update(sqlQuery, id);
    }
}
