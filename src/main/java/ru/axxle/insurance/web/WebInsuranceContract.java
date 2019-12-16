package ru.axxle.insurance.web;

public class WebInsuranceContract {

    private String contractId;
    private String contractDate;
    private String status;

    private WebInsuranceCalc calcInfo = new WebInsuranceCalc();
    private WebInsuranceClient holderInfo = new WebInsuranceClient();
    private WebRealtyLocation realtyLocation = new WebRealtyLocation();

    public WebInsuranceContract() {
    }

    public WebInsuranceContract(String contractId, String contractDate, String status, WebInsuranceCalc calcInfo, WebInsuranceClient holderInfo, WebRealtyLocation realtyLocation) {
        this.contractId = contractId;
        this.contractDate = contractDate;
        this.status = status;
        this.calcInfo = calcInfo;
        this.holderInfo = holderInfo;
        this.realtyLocation = realtyLocation;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WebInsuranceCalc getCalcInfo() {
        return calcInfo;
    }

    public void setCalcInfo(WebInsuranceCalc calcInfo) {
        this.calcInfo = calcInfo;
    }

    public WebInsuranceClient getHolderInfo() {
        return holderInfo;
    }

    public void setHolderInfo(WebInsuranceClient holderInfo) {
        this.holderInfo = holderInfo;
    }

    public WebRealtyLocation getRealtyLocation() {
        return realtyLocation;
    }

    public void setRealtyLocation(WebRealtyLocation realtyLocation) {
        this.realtyLocation = realtyLocation;
    }
}