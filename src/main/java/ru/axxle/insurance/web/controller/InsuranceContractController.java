package ru.axxle.insurance.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.axxle.insurance.web.WebInsuranceContract;
import ru.axxle.insurance.web.service.WebInsuranceContractService;

@RestController
@RequestMapping(value = InsuranceContractController.REQUEST_PATH)
public class InsuranceContractController {
	public static final String REQUEST_PATH = "/insurance/contract";
	private static final String PREFILL = "/prefill";
	private static final String ID = "id";
	public static final String BY_ID = "/{id}";

	@Autowired
	WebInsuranceContractService webInsuranceContractService;

	@RequestMapping(
			value = PREFILL,
			method = RequestMethod.GET
	)
	public @ResponseBody
	ResponseEntity<WebInsuranceContract> getPrefilled() {
		return new ResponseEntity<>(webInsuranceContractService.getPrefilled(), HttpStatus.OK);
	}

	@RequestMapping(
			value = BY_ID,
			method = RequestMethod.GET
	)
	public @ResponseBody
	ResponseEntity<WebInsuranceContract> getById(@PathVariable(ID) String id) {
		webInsuranceContractService.getById(id);
		return new ResponseEntity<>(webInsuranceContractService.getById(id), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE
	)
    public WebInsuranceContract create(
            @RequestBody WebInsuranceContract entity) {
		//webInsuranceContractService.create(entity);
        return entity;
    }

	@RequestMapping(
			value = BY_ID,
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE
	)
	public WebInsuranceContract update(@PathVariable(ID) String id,
			@RequestBody WebInsuranceContract entity) {
		//webInsuranceContractService.update(entity);
		return entity;
	}
}