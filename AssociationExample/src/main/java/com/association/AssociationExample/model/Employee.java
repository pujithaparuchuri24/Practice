package com.association.AssociationExample.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="ename")
	private String name;
    
    @OneToMany(cascade=CascadeType.ALL) 
    private List<PhoneNumber> phone;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setEmpname(String empname) {
		this.name = empname;
	}
     
	public List<PhoneNumber> getPhone() {
		return phone;
	}
	public void setPhone(List<PhoneNumber> phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
    
}
