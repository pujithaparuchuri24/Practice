package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.EmployeeModel;
import com.example.demo.service.EmpServiceInterface;

@Controller
public class EmployeeController {
	@Autowired
	private EmpServiceInterface service;
    @RequestMapping("/hi")
	public String s1()
	{
    	System.out.println("hi");
    			return "EmpployeeReg";
	}
    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute EmployeeModel em)
    {
    	int id=service.save(em);
    	String msg=id+"  saved";
    	return new ModelAndView("EmpployeeReg","msg",msg);
    }
}
