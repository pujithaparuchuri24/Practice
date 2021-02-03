package com.association.AssociationExample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class PhoneNumber {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="p_id")
	private Integer id;
	@Column(name="phone")
	private Long phnum;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getPhnum() {
		return phnum;
	}
	public void setPhnum(Long phnum) {
		this.phnum = phnum;
	}
	@Override
	public String toString() {
		return "PhoneNumber [id=" + id + ", phnum=" + phnum + "]";
	}
	
	

}
