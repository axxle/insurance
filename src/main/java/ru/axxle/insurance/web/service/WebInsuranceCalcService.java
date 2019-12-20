package ru.axxle.insurance.web.service;

import ru.axxle.insurance.web.WebInsuranceCalc;
import ru.axxle.insurance.web.WebInsuranceCalcFull;

public interface WebInsuranceCalcService {

    WebInsuranceCalcFull calc (WebInsuranceCalc webModel);

}
