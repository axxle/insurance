package ru.axxle.insurance.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.axxle.insurance.web.WebInsuranceCalc;
import ru.axxle.insurance.web.service.WebInsuranceCalcService;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping(value = InsuranceCalcController.REQUEST_PATH)
public class InsuranceCalcController {

	public static final String REQUEST_PATH = "/insurance/calc";

	@Autowired
	WebInsuranceCalcService webInsuranceCalcService;

	@RequestMapping(method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE
	)
    public WebInsuranceCalc calc(@RequestBody @Valid WebInsuranceCalc entity) {
        return webInsuranceCalcService.calc(entity);
    }
}