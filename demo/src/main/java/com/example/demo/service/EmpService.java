package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeModel;
import com.example.demo.repo.EmployeeRepo;
@Service 
public class EmpService implements EmpServiceInterface {
@Autowired
private EmployeeRepo repo;
	@Override
	public int save(EmployeeModel e) {
		return repo.save(e).getId();
	}

}
