package ru.axxle.insurance.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.axxle.insurance.web.WebInsuranceContractView;
import ru.axxle.insurance.web.service.WebInsuranceContractViewService;

import java.util.List;

@RestController
@RequestMapping(value = InsuranceContractViewController.REQUEST_PATH)
public class InsuranceContractViewController {
	public static final String REQUEST_PATH = "/insurance/view";
	public static final String VIEW_ALL = "/";

	@Autowired
	WebInsuranceContractViewService webInsuranceContractViewService;

	@RequestMapping(
			value = VIEW_ALL,
			method = RequestMethod.GET
	)
	public @ResponseBody
	ResponseEntity<List<WebInsuranceContractView>> getAll() {
		return new ResponseEntity<>(webInsuranceContractViewService.getAll(), HttpStatus.OK);
	}
}