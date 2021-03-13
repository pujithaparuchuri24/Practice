package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="emp_reg")
public class EmployeeModel {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="id")
     private int id;
     
     @Column(name="e_name")
     @NotBlank(message="name must")
     private String name;
     
     @Column(name="email")
     private String email;
     
     @Column(name="password")
     private String pwd;
      
	public EmployeeModel(int id, String name, String email, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
	}
     
     
}
