package ru.axxle.insurance.web.service;

import ru.axxle.insurance.InsuranceContract;
import ru.axxle.insurance.service.InsuranceContractService;
import ru.axxle.insurance.web.WebInsuranceContract;

public class WebInsuranceContractServiceImpl implements WebInsuranceContractService {

    InsuranceContractService insuranceContractService;

    @Override
    public WebInsuranceContract getPrefilled() {
        WebInsuranceContract webInsuranceContract = new WebInsuranceContract();
        webInsuranceContract.setStatus("NEW");
        return webInsuranceContract;
    }

    @Override
    public WebInsuranceContract getById(String id) {
        WebInsuranceContract webInsuranceContract = map(insuranceContractService.getById(id));
        return webInsuranceContract;
    }

    @Override
    public WebInsuranceContract update(WebInsuranceContract webInsuranceContract) {
        return webInsuranceContract;
    }


    WebInsuranceContract map (InsuranceContract insuranceContract) {
        return new WebInsuranceContract();
    }
}