package ru.axxle.insurance.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.axxle.insurance.InsuranceCalc;
import ru.axxle.insurance.service.InsuranceCalcService;
import ru.axxle.insurance.web.WebInsuranceCalc;

public class WebInsuranceCalcServiceImpl implements WebInsuranceCalcService {

    @Autowired
    private InsuranceCalcService calcService;

    public WebInsuranceCalc calc(WebInsuranceCalc webModel) {
        InsuranceCalc model = calcService.calc(convertToModel(webModel));
        return convertToWebModel(model);
    }

    private static InsuranceCalc convertToModel (WebInsuranceCalc webModel) {
        InsuranceCalc model = new InsuranceCalc();
        model.setInsuranceAmount(webModel.getInsuranceAmount());
        model.setRealtyType(webModel.getRealtyType());
        model.setRealtyBuildYear(webModel.getRealtyBuildYear());
        model.setRealtyArea(Double.parseDouble(webModel.getRealtyArea()));
        model.setInsuranceStartDate(webModel.getInsuranceStartDate());
        model.setInsuranceEndDate(webModel.getInsuranceEndDate());
        model.setInsuranceCalcDate(webModel.getInsuranceCalcDate());
        model.setInsurancePremium(webModel.getInsurancePremium());
        return model;
    }

    private static WebInsuranceCalc convertToWebModel (InsuranceCalc model) {
        WebInsuranceCalc webModel = new WebInsuranceCalc();
        webModel.setInsuranceAmount(model.getInsuranceAmount());
        webModel.setRealtyType(model.getRealtyType());
        webModel.setRealtyBuildYear(model.getRealtyBuildYear());
        webModel.setRealtyArea(model.getRealtyArea()+"");
        webModel.setInsuranceStartDate(model.getInsuranceStartDate());
        webModel.setInsuranceEndDate(model.getInsuranceEndDate());
        webModel.setInsuranceCalcDate(model.getInsuranceCalcDate());
        webModel.setInsurancePremium(model.getInsurancePremium());
        return webModel;
    }

    public WebInsuranceCalcServiceImpl() {
    }

    public WebInsuranceCalcServiceImpl(InsuranceCalcService calcService) {
        this.calcService = calcService;
    }

    public InsuranceCalcService getCalcService() {
        return calcService;
    }

    public void setCalcService(InsuranceCalcService calcService) {
        this.calcService = calcService;
    }
}
