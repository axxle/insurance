package ru.axxle.insurance.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ru.axxle.insurance.web.WebInsuranceContract;

@RestController
@RequestMapping(value = InsuranceContractController.REQUEST_PATH)
public class InsuranceContractController {
	public static final String REQUEST_PATH = "/insurance/contract";
	private static final String PREFILL = "/prefill";
	//getAll
	//getById
	//prefill
	//create
	//update
	@RequestMapping(
	value = "/",
	method = RequestMethod.GET
	)
    public @ResponseBody
    ResponseEntity<WebInsuranceContract> getAll(HttpServletRequest request,
                                                 HttpServletResponse response) {
        return new ResponseEntity<>(new WebInsuranceContract(), HttpStatus.OK);
    }
	/*
	@RequestMapping(method = RequestMethod.POST, headers = {
		HttpUtils.ACCEPT_JSON_UTF_8
    })
    public WebInsuranceContract create(
            @RequestBody WebInsuranceContract entity) {
        return webInsuranceContractService.create(entity);
    }*/
	
	
	//--delete
	//--getByQuery
}