package ru.axxle.insurance.web;

public class WebInsuranceClient {
    private String fullName;
    private String birthDate;
    private String passportSeries;
    private String passportNumber;

    public WebInsuranceClient() {
    }

    public WebInsuranceClient(String fullName, String birthDate, String passportSeries, String passportNumber) {
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
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