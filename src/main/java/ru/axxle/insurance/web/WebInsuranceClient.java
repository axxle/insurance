package ru.axxle.insurance.web;

import java.util.Date;

public class WebInsuranceClient {
    private String fullName;        // ФИО
    private Date birthDate;         // Дата рождения
    private String passportSeries;  // Паспорт серия
    private String passportNumber;  // Паспорт номер

    public WebInsuranceClient() {
    }

    public WebInsuranceClient(String fullName, Date birthDate, String passportSeries, String passportNumber) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}