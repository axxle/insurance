package ru.axxle.insurance.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.axxle.insurance.InsuranceCalc;
import ru.axxle.insurance.service.InsuranceCalcService;
import ru.axxle.insurance.web.WebInsuranceCalc;
import ru.axxle.insurance.web.WebInsuranceCalcFull;
import ru.axxle.insurance.web.mapper.MapperFacade;

public class WebInsuranceCalcServiceImpl implements WebInsuranceCalcService {

    @Autowired
    MapperFacade mapperFacade;

    @Autowired
    private InsuranceCalcService calcService;

    public WebInsuranceCalcFull calc(WebInsuranceCalc webModel) {
        InsuranceCalc model = calcService.calc(
                mapperFacade.map(webModel, InsuranceCalc.class)
        );
        return mapperFacade.map(model, WebInsuranceCalcFull.class);
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
