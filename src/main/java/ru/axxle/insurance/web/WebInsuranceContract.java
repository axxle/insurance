package ru.axxle.insurance.web;

import ru.axxle.insurance.ValidationUtils;

import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Pattern;

public class WebInsuranceContract {
    @Pattern(regexp= ValidationUtils.insuranceContractIdCheck, message= ValidationUtils.insuranceContractIdCheckMessage)
    private String contractId;          // Серия-Номер 	contractSeries + '-' + contractNumber
    private Date contractDate;          // Дата заключения
    private String policyHolder;        // Страхователь
    private BigDecimal premium;         // Премия
    private String contractDuration;    // Срок действия contractStartDate - contractEndDate
	
	public WebInsuranceContract(){}

    public WebInsuranceContract(String contractId) {
        this.contractId = contractId;
    }


    public WebInsuranceContract(String contractId, Date contractDate, String policyHolder, BigDecimal premium, String contractDuration) {
        this.contractId = contractId;
        this.contractDate = contractDate;
        this.policyHolder = policyHolder;
        this.premium = premium;
        this.contractDuration = contractDuration;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public String getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(String contractDuration) {
        this.contractDuration = contractDuration;
    }
}