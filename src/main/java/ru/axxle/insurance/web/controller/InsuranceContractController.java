package ru.axxle.insurance.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ru.axxle.insurance.web.WebInsuranceContract;
import ru.axxle.insurance.web.service.WebInsuranceContractService;

import java.util.List;

@RestController
@RequestMapping(value = InsuranceContractController.REQUEST_PATH)
public class InsuranceContractController {
	public static final String REQUEST_PATH = "/insurance/contract";
	private static final String PREFILL = "/prefill";

	@Autowired
	WebInsuranceContractService webInsuranceContractService;

	//getAll
	@RequestMapping(
			value = "/",
			method = RequestMethod.GET
	)
	public @ResponseBody
	ResponseEntity<List<WebInsuranceContract>> getAll(HttpServletRequest request,
													  HttpServletResponse response) {

		return new ResponseEntity<>(webInsuranceContractService.getAll(), HttpStatus.OK);
	}

	//prefill
	@RequestMapping(
			value = "/prefill",
			method = RequestMethod.GET
	)
	public @ResponseBody
	ResponseEntity<WebInsuranceContract> getPrefilled(HttpServletRequest request,
													  HttpServletResponse response) {

		return new ResponseEntity<>(webInsuranceContractService.getPrefilled(), HttpStatus.OK);
	}

	//getById
	@RequestMapping(
			value = "/{id}",
			method = RequestMethod.GET
	)
	public @ResponseBody
	ResponseEntity<WebInsuranceContract> getById(@PathVariable("id") long id) {

		return new ResponseEntity<>(webInsuranceContractService.getById(id), HttpStatus.OK);
	}

	//create
	@RequestMapping(method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE
	)
    public WebInsuranceContract create(
            @RequestBody WebInsuranceContract entity) {
        return entity;//webInsuranceContractService.create(entity);
    }

	//update

	//--delete
	//--getByQuery
}