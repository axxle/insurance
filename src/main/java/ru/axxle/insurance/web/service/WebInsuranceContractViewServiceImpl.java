package ru.axxle.insurance.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.axxle.insurance.InsuranceContract;
import ru.axxle.insurance.service.InsuranceContractService;
import ru.axxle.insurance.web.WebInsuranceContractView;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebInsuranceContractViewServiceImpl implements WebInsuranceContractViewService{

    @Autowired
    InsuranceContractService insuranceContractService;

    public WebInsuranceContractViewServiceImpl() { }

    public List<WebInsuranceContractView> getAll() {
        List<InsuranceContract> insuranceContractList = insuranceContractService.getAll();
        List<WebInsuranceContractView> insuranceContractViewList = new ArrayList<WebInsuranceContractView>();
        for (InsuranceContract contract : insuranceContractList) {
            WebInsuranceContractView contractView = new WebInsuranceContractView();
            contractView.setContractId(contract.getContractId());
            contractView.setContractDate(LocalDate.parse(contract.getContractDate()));//
            contractView.setPremium(new BigDecimal(contract.getInsurancePremium()) /*contract.getInsurancePremium()*/);
            contractView.setContractDuration(contract.getInsuranceStartDate() + " - " + contract.getInsuranceEndDate());
            contractView.setPolicyHolder(contract.getFullName());
            insuranceContractViewList.add(contractView);
        }
        return insuranceContractViewList;
    }

}
