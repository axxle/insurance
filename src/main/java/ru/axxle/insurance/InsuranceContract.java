package ru.axxle.insurance;

public class InsuranceContract {

    private String contractId;
    private String contractDate;

    private String insurancePremium;
    private String insuranceAmount;     //integer or long
    private String realtyType;          //enum
    private String realtyBuildYear;     //??? number or date subtype
    private String realtyArea;          //double
    private String insuranceStartDate;  //date
    private String insuranceEndDate;    //date

    private String fullName;
    private String birthDate;
    private String passportSeries;
    private String passportNumber;


    public InsuranceContract() {
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getInsurancePremium() {
        return insurancePremium;
    }

    public void setInsurancePremium(String insurancePremium) {
        this.insurancePremium = insurancePremium;
    }

    public String getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(String insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public String getRealtyType() {
        return realtyType;
    }

    public void setRealtyType(String realtyType) {
        this.realtyType = realtyType;
    }

    public String getRealtyBuildYear() {
        return realtyBuildYear;
    }

    public void setRealtyBuildYear(String realtyBuildYear) {
        this.realtyBuildYear = realtyBuildYear;
    }

    public String getRealtyArea() {
        return realtyArea;
    }

    public void setRealtyArea(String realtyArea) {
        this.realtyArea = realtyArea;
    }

    public String getInsuranceStartDate() {
        return insuranceStartDate;
    }

    public void setInsuranceStartDate(String insuranceStartDate) {
        this.insuranceStartDate = insuranceStartDate;
    }

    public String getInsuranceEndDate() {
        return insuranceEndDate;
    }

    public void setInsuranceEndDate(String insuranceEndDate) {
        this.insuranceEndDate = insuranceEndDate;
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