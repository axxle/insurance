package ru.axxle.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.axxle.insurance.InsuranceContract;
import ru.axxle.insurance.dao.InsuranceContractDao;

import java.util.List;

public class InsuranceContractServiceImpl implements InsuranceContractService {

    @Autowired
    InsuranceContractDao insuranceContractDao;

    @Override
    public List<InsuranceContract> getAll() {
        return insuranceContractDao.getAll();
    }

    @Override
    public InsuranceContract getById(String id) {
        return null;
    }
}
