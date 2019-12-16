package ru.axxle.insurance.web.service;

import ru.axxle.insurance.InsuranceCalc;
import ru.axxle.insurance.web.WebInsuranceCalc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WebInsuranceCalcServiceImpl implements WebInsuranceCalcService {

    private String k1;
    private String k2;

    public WebInsuranceCalcServiceImpl(String k1, String k2) {
        this.k1 = k1;
        this.k2 = k2;
    }

    public WebInsuranceCalc calc(WebInsuranceCalc webModel) {
        Date date = new Date();
        webModel.setInsuranceCalcDate(new SimpleDateFormat("yyyy-MM-dd").format(date));
        webModel.setInsurancePremium("" + k1 + k2);
        return webModel;
    }

    public String getK1() {
        return k1;
    }

    public void setK1(String k1) {
        this.k1 = k1;
    }

    public String getK2() {
        return k2;
    }

    public void setK2(String k2) {
        this.k2 = k2;
    }
}
