package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeModel;
import com.example.demo.service.EmpServiceInterface;

@RestController
public class EmployeeController {
	@Autowired
	private EmpServiceInterface service;
   
    @GetMapping("/save")
    public int  save( @RequestBody EmployeeModel model)
    {
    	return service.save(model);
    }
    
}
