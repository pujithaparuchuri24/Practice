package com.association.AssociationExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.association.AssociationExample.model.Employee;
@Repository
public interface EmployeRepo extends JpaRepository<Employee, Integer> {

}
