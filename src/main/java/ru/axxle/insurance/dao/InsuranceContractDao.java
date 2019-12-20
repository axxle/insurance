package ru.axxle.insurance.dao;

import ru.axxle.insurance.InsuranceContract;

import java.util.List;

public interface InsuranceContractDao {

    List<InsuranceContract> getAll();

    InsuranceContract getById(String entityId);

    InsuranceContract create(InsuranceContract entity);

    InsuranceContract update(InsuranceContract entity);

}
