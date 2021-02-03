package com.association.AssociationExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.association.AssociationExample.model.PhoneNumber;
@Repository
public interface PhoneRepo extends JpaRepository<PhoneNumber, Integer> {

}
