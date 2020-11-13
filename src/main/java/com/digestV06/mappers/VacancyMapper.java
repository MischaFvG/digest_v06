package com.digestV06.mappers;

import com.digestV06.models.VacancyModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VacancyMapper implements RowMapper<VacancyModel> {

    @Override
    public VacancyModel mapRow(ResultSet resultSet, int i) throws SQLException {
        VacancyModel vacancyModel = new VacancyModel();
        vacancyModel.setId(resultSet.getInt("id"));
        vacancyModel.setVacancyName(resultSet.getString("VACANCY_NAME"));
        vacancyModel.setVacancyQualification(resultSet.getString("VACANCY_QUALIFICATION"));
        vacancyModel.setVacancyObligation(resultSet.getString("VACANCY_OBLIGATION"));
        vacancyModel.setVacancyDirector(resultSet.getString("VACANCY_DIRECTOR"));
        vacancyModel.setVacancySalary(resultSet.getString("VACANCY_SALARY"));
        vacancyModel.setVacancyLocation(resultSet.getString("VACANCY_LOCATION"));
        vacancyModel.setVacancyAssessment(resultSet.getString("VACANCY_ASSESSMENT"));
        vacancyModel.setEndVacancyDate(resultSet.getString("VACANCY_END_DATE"));
        return vacancyModel;
    }
}
