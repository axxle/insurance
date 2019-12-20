package ru.axxle.insurance.web;

public class WebInsuranceContract {

    private String contractId;
    private String contractDate;
    private String status;

    private WebInsuranceCalcFull calcInfoFull;
    private WebInsuranceClient holderInfo = new WebInsuranceClient();
    private WebRealtyLocation realtyLocation = new WebRealtyLocation();

    public WebInsuranceContract() {
    }

    public WebInsuranceContract(String contractId, String contractDate, String status, WebInsuranceCalcFull calcInfoFull, WebInsuranceClient holderInfo, WebRealtyLocation realtyLocation) {
        this.contractId = contractId;
        this.contractDate = contractDate;
        this.status = status;
        this.calcInfoFull = calcInfoFull;
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

    public WebInsuranceCalcFull getCalcInfoFull() {
        return calcInfoFull;
    }

    public void setCalcInfoFull(WebInsuranceCalcFull calcInfoFull) {
        this.calcInfoFull = calcInfoFull;
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