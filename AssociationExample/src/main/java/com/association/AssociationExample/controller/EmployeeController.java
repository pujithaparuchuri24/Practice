package com.association.AssociationExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.association.AssociationExample.model.Employee;
import com.association.AssociationExample.repository.EmployeRepo;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private EmployeRepo emp;

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee e)
	{
		System.out.println(e);
        return emp.save(e);
	}
	@GetMapping("/getall")
	public List<Employee> getAllEmployee()
	{
		return emp.findAll();
	}
	@GetMapping("/get/{id}")
	public Employee getById(@PathVariable("id") int i)
	{
		return emp.findById(i).get();
	}


}
