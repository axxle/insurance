package ru.axxle.insurance.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.axxle.insurance.InsuranceCalc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml"})
public class InsuranceCalcServiceImplTest {

    @Autowired
    InsuranceCalcServiceImpl calcService;

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
        calcModel.setInsurancePremium("1000.12");
        Assert.assertEquals("1000.12", calcModel.getInsurancePremium());
        Assert.assertNotNull(calcService);
        InsuranceCalc calcedModel = calcService.calc(calcModel);
        Assert.assertNotNull(calcedModel);
        Assert.assertEquals("1000.12", calcModel.getInsurancePremium());
    }

}