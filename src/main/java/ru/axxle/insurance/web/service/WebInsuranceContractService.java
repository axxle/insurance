package ru.axxle.insurance.web.service;

import ru.axxle.insurance.web.WebInsuranceContract;

import java.util.List;

public interface WebInsuranceContractService {

    List<WebInsuranceContract> getAll();

    WebInsuranceContract getPrefilled();

    WebInsuranceContract getById(long id);

}
