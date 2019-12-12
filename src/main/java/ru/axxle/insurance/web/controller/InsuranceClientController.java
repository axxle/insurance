package ru.axxle.insurance.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class InsuranceClientController {
	
	@RequestMapping(
	value = "/insurance/client",
	method = RequestMethod.GET
	)
    public @ResponseBody
    ResponseEntity<String> test(HttpServletRequest request,
                                                 HttpServletResponse response) {
        return new ResponseEntity<>("clients", HttpStatus.OK);
    }
}