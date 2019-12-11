package ru.axxle.insurance.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Scanner;
import java.io.IOException;

@RestController
public class InsuranceContractController {
	
	@RequestMapping(
	value = "/insurance/contract",
	method = RequestMethod.GET
	)
    public @ResponseBody
    ResponseEntity<String> test(HttpServletRequest request,
                                                 HttpServletResponse response) {
        return new ResponseEntity<>("contracts", HttpStatus.OK);
    }
}