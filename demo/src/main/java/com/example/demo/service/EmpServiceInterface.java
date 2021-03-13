package com.example.demo.service;

import java.util.List;

import com.example.demo.model.EmployeeModel;

public interface EmpServiceInterface {
	public int save(EmployeeModel e);
	public List<EmployeeModel> getall();

}
