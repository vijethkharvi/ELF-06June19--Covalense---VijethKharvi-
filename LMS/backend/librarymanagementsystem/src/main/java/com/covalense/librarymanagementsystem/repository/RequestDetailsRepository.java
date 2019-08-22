package com.covalense.librarymanagementsystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.covalense.librarymanagementsystem.beans.RequestDetailsBean;

public interface RequestDetailsRepository extends CrudRepository<RequestDetailsBean, Integer> {
	
}
