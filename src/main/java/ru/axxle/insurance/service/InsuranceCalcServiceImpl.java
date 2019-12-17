package ru.axxle.insurance.service;

import ru.axxle.insurance.InsuranceCalc;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InsuranceCalcServiceImpl implements InsuranceCalcService {
    private String factorRealtyTypeApartment;
    private String factorRealtyTypeHouse;
    private String factorRealtyTypeRoom;
    private String factorRealtyBuildYearLessThan2000;
    private String factorRealtyBuildYearBetween2000and2014;
    private String factorRealtyBuildYear2015AndMore;
    private String factorRealtyAreaLessThan50;
    private String factorRealtyAreaBetween50and100;
    private String factorRealtyAreaMore100;

    public InsuranceCalcServiceImpl() {
    }

    public InsuranceCalcServiceImpl(String factorRealtyTypeApartment, String factorRealtyTypeHouse, String factorRealtyTypeRoom, String factorRealtyBuildYearLessThan2000, String factorRealtyBuildYearBetween2000and2014, String factorRealtyBuildYear2015AndMore, String factorRealtyAreaLessThan50, String factorRealtyAreaBetween50and100, String factorRealtyAreaMore100) {
        this.factorRealtyTypeApartment = factorRealtyTypeApartment;
        this.factorRealtyTypeHouse = factorRealtyTypeHouse;
        this.factorRealtyTypeRoom = factorRealtyTypeRoom;
        this.factorRealtyBuildYearLessThan2000 = factorRealtyBuildYearLessThan2000;
        this.factorRealtyBuildYearBetween2000and2014 = factorRealtyBuildYearBetween2000and2014;
        this.factorRealtyBuildYear2015AndMore = factorRealtyBuildYear2015AndMore;
        this.factorRealtyAreaLessThan50 = factorRealtyAreaLessThan50;
        this.factorRealtyAreaBetween50and100 = factorRealtyAreaBetween50and100;
        this.factorRealtyAreaMore100 = factorRealtyAreaMore100;
    }

    @Override
    public InsuranceCalc calc(InsuranceCalc insuranceCalc) {
        //определить коэффициенты
        BigDecimal factorRealtyType = takeRealtyTypeFactor(insuranceCalc.getRealtyType());
        BigDecimal factorRealtyBuildYear = takeRealtyBuildYearFactor(insuranceCalc.getRealtyBuildYear());
        BigDecimal factorRealtyArea = takeRealtyAreaFactor(insuranceCalc.getRealtyArea());
        //рассчитать
        BigDecimal premium = calc(factorRealtyType, factorRealtyBuildYear, factorRealtyArea);
        insuranceCalc.setInsurancePremium(premium.toString());
        insuranceCalc.setInsuranceCalcDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        return insuranceCalc;
    }

    public BigDecimal calc(BigDecimal factorRealtyType, BigDecimal factorRealtyBuildYear, BigDecimal factorRealtyArea) {
        BigDecimal premium;
        //тут будут сами расчеты:
        premium = new BigDecimal("1000.12");
        //Страховая премия = (Страховая сумма / кол-во дней) * Коэф.ТН * Коэф.ГП * Коэф.Пл
        //insurancePremium = (insurancAmount / insuranceDays) * factorRealtyType * factorRealtyBuildYear * factorRealtyArea;
        return premium;
    }

    private BigDecimal takeRealtyTypeFactor(String realtyType){
        if ("квартира".equals(realtyType)) {
            return new BigDecimal(this.factorRealtyTypeApartment);
        }
        if ("дом".equals(realtyType)) {
            return new BigDecimal(this.factorRealtyTypeHouse);
        }
        if ("комната".equals(realtyType)) {
            return new BigDecimal(this.factorRealtyTypeRoom);
        }
        return null;
    }

    private BigDecimal takeRealtyBuildYearFactor(String s){
        return null;
    }

    private BigDecimal takeRealtyAreaFactor(String s){
        return null;
    }

    public String getFactorRealtyTypeApartment() {
        return factorRealtyTypeApartment;
    }

    public void setFactorRealtyTypeApartment(String factorRealtyTypeApartment) {
        this.factorRealtyTypeApartment = factorRealtyTypeApartment;
    }

    public String getFactorRealtyTypeHouse() {
        return factorRealtyTypeHouse;
    }

    public void setFactorRealtyTypeHouse(String factorRealtyTypeHouse) {
        this.factorRealtyTypeHouse = factorRealtyTypeHouse;
    }

    public String getFactorRealtyTypeRoom() {
        return factorRealtyTypeRoom;
    }

    public void setFactorRealtyTypeRoom(String factorRealtyTypeRoom) {
        this.factorRealtyTypeRoom = factorRealtyTypeRoom;
    }

    public String getFactorRealtyBuildYearLessThan2000() {
        return factorRealtyBuildYearLessThan2000;
    }

    public void setFactorRealtyBuildYearLessThan2000(String factorRealtyBuildYearLessThan2000) {
        this.factorRealtyBuildYearLessThan2000 = factorRealtyBuildYearLessThan2000;
    }

    public String getFactorRealtyBuildYearBetween2000and2014() {
        return factorRealtyBuildYearBetween2000and2014;
    }

    public void setFactorRealtyBuildYearBetween2000and2014(String factorRealtyBuildYearBetween2000and2014) {
        this.factorRealtyBuildYearBetween2000and2014 = factorRealtyBuildYearBetween2000and2014;
    }

    public String getFactorRealtyBuildYear2015AndMore() {
        return factorRealtyBuildYear2015AndMore;
    }

    public void setFactorRealtyBuildYear2015AndMore(String factorRealtyBuildYear2015AndMore) {
        this.factorRealtyBuildYear2015AndMore = factorRealtyBuildYear2015AndMore;
    }

    public String getFactorRealtyAreaLessThan50() {
        return factorRealtyAreaLessThan50;
    }

    public void setFactorRealtyAreaLessThan50(String factorRealtyAreaLessThan50) {
        this.factorRealtyAreaLessThan50 = factorRealtyAreaLessThan50;
    }

    public String getFactorRealtyAreaBetween50and100() {
        return factorRealtyAreaBetween50and100;
    }

    public void setFactorRealtyAreaBetween50and100(String factorRealtyAreaBetween50and100) {
        this.factorRealtyAreaBetween50and100 = factorRealtyAreaBetween50and100;
    }

    public String getFactorRealtyAreaMore100() {
        return factorRealtyAreaMore100;
    }

    public void setFactorRealtyAreaMore100(String factorRealtyAreaMore100) {
        this.factorRealtyAreaMore100 = factorRealtyAreaMore100;
    }
}
