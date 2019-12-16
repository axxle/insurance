package ru.axxle.insurance;

import ru.axxle.insurance.web.WebInsuranceCalc;

public class InsuranceContract {
    private WebInsuranceCalc webInsuranceCalc;

    public InsuranceContract() {
    }

    public WebInsuranceCalc getWebInsuranceCalc() {
        return webInsuranceCalc;
    }

    public void setWebInsuranceCalc(WebInsuranceCalc webInsuranceCalc) {
        this.webInsuranceCalc = webInsuranceCalc;
    }
}