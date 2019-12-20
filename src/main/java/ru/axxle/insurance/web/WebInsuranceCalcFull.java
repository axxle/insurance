package ru.axxle.insurance.web;

import javax.validation.constraints.Pattern;
import java.time.LocalDate;

public class WebInsuranceCalcFull extends WebInsuranceCalc {

    public static final String insuranceCalcDateCheckPattern = "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$"; //проверяет только yyyy-MM-dd
    public static final String insuranceCalcDateCheckMessage = "Год должен быть четырехзначный и не больше текущего года";
    @Pattern (regexp = insuranceCalcDateCheckPattern, message = insuranceCalcDateCheckMessage)        //проверяем только при сохранения договора
    private String insuranceCalcDate;

    //Заполняется автоматически после выполнения расчета, не может быть отрицательной, округлять до 2 цифр после запятой
    public static final String insurancePremiumCheckPattern = "^([0]([\\.][1-9][0-9]{0,1}){1})|([0]([\\.][0-9][1-9]{0,1}){1})|(([1-9]{1}[0-9]{0,})([\\.][1-9][0-9]{0,1}){1})$";
    public static final String insurancePremiumCheckMessage = "Заполняется автоматически после выполнения расчета, не может быть отрицательной, округлять до 2 цифр после запятой";
    @Pattern (regexp = insurancePremiumCheckPattern, message = insurancePremiumCheckMessage) //проверяем только при сохранения договора
    private String insurancePremium;

    public WebInsuranceCalcFull() {}

    public WebInsuranceCalcFull(String insuranceAmount, String realtyType, String realtyBuildYear, String realtyArea, String insuranceStartDate, String insuranceEndDate, String insuranceCalcDate, String insurancePremium) {
        super(insuranceAmount, realtyType, realtyBuildYear, realtyArea, insuranceStartDate, insuranceEndDate);
        this.insuranceCalcDate = insuranceCalcDate;
        this.insurancePremium = insurancePremium;
    }

    public String getInsuranceCalcDate() {
        return insuranceCalcDate;
    }

    public void setInsuranceCalcDate(String insuranceCalcDate) {
        this.insuranceCalcDate = insuranceCalcDate;
    }

    public String getInsurancePremium() {
        return insurancePremium;
    }

    public void setInsurancePremium(String insurancePremium) {
        this.insurancePremium = insurancePremium;
    }
}