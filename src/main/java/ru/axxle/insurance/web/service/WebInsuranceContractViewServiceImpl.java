package ru.axxle.insurance.web.service;

import ru.axxle.insurance.web.WebInsuranceContractView;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class WebInsuranceContractViewServiceImpl implements WebInsuranceContractViewService{

    public WebInsuranceContractViewServiceImpl() { }

    public List<WebInsuranceContractView> getAll() {
        List<WebInsuranceContractView> webInsuranceContractViewList = Arrays.asList(
                new WebInsuranceContractView("112112",
                        new Date(),
                        "Иванов Иван Иваныч",
                        new BigDecimal("120000"),
                        "10.10.2019-09.10.2020"),
                new WebInsuranceContractView("112113",
                        new Date(),
                        "Федоров Федор Федорович",
                        new BigDecimal("150000"),
                        "11.10.2019-10.10.2020"));
        return webInsuranceContractViewList;
    }

}
