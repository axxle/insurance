package ru.axxle.insurance.web.service;

import ru.axxle.insurance.web.WebInsuranceContract;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class WebInsuranceContractServiceImpl implements WebInsuranceContractService {

    @Override
    public List<WebInsuranceContract> getAll() {
        List<WebInsuranceContract> webInsuranceContractList = Arrays.asList(
                new WebInsuranceContract("1122112",
                        new Date(),
                        "Иванов Иван Иваныч",
                        new BigDecimal("120000"),
                        "10.10.2019-09.10.2020"),
                new WebInsuranceContract("1122113",
                        new Date(),
                        "Федоров Федор Федорович",
                        new BigDecimal("150000"),
                        "11.10.2019-10.10.2020"));
        return webInsuranceContractList;
    }

    @Override
    public WebInsuranceContract getPrefilled() {
        return new WebInsuranceContract();
    }

    @Override
    public WebInsuranceContract getById(long id) {
        WebInsuranceContract webInsuranceContract = new WebInsuranceContract();
        webInsuranceContract.setContractId("" + id);
        return webInsuranceContract;
    }
}