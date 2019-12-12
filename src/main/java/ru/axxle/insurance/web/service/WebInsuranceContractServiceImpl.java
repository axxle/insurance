package ru.axxle.insurance.web.service;

import ru.axxle.insurance.web.WebInsuranceContract;

import java.util.List;

public class WebInsuranceContractServiceImpl implements WebInsuranceContractService {
    @Override
    public List<WebInsuranceContract> getAll() {
        return null;
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