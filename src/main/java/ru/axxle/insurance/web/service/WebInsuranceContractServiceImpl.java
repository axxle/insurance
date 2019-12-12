package ru.axxle.insurance.web.service;

import ru.axxle.insurance.web.WebInsuranceContract;

import java.util.Arrays;
import java.util.List;

public class WebInsuranceContractServiceImpl implements WebInsuranceContractService {

    @Override
    public List<WebInsuranceContract> getAll() {
        List<WebInsuranceContract> webInsuranceContractList = Arrays.asList(
                new WebInsuranceContract("112-2112"), new WebInsuranceContract("112-2113")
        );
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