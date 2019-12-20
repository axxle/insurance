package ru.axxle.insurance.service;

import ru.axxle.insurance.InsuranceContract;

import java.util.List;

public interface InsuranceContractService {

    List<InsuranceContract> getAll();

    InsuranceContract getById(String id);

}
