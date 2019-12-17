package ru.axxle.insurance.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.axxle.insurance.InsuranceCalc;

public class InsuranceCalcServiceImplTest {

    @Autowired
    InsuranceCalcService calcService;

    @Test
    public void calcTest() throws Exception {
        InsuranceCalc calcModel = new InsuranceCalc();
        calcModel.setInsuranceAmount("");
        calcModel.setRealtyType("");
        calcModel.setRealtyBuildYear("");
        calcModel.setRealtyArea("");
        calcModel.setInsuranceStartDate("");
        calcModel.setInsuranceEndDate("");
        calcModel.setInsuranceCalcDate("");
        calcModel.setInsurancePremium("");
        InsuranceCalc calcedModel = calcService.calc(calcModel);
        Assert.assertEquals("1000.12", calcedModel.getInsurancePremium());
        //assertEquals(15, calculator.getSum(7,8)/;
    }

}