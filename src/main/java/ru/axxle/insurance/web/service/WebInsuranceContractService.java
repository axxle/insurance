package ru.axxle.insurance.web.service;

import ru.axxle.insurance.web.WebInsuranceContract;

import java.util.List;

public interface WebInsuranceContractService {

    WebInsuranceContract getPrefilled();

    WebInsuranceContract getById(String id);

    WebInsuranceContract update(WebInsuranceContract webInsuranceContract);

}
