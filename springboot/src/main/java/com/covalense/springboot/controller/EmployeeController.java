package com.covalense.springboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmployeeAddressInfoBean;
import com.covalense.springboot.dto.EmployeeEducationalInfo;
import com.covalense.springboot.dto.EmployeeExperienceInfoBean;
import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeResponse;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository repository;

	@GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloworld() {
		return "Hello World!!..";
	}

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {
		bean.getEmployeeOtherInfo().setEmpInfo(bean);
		for (EmployeeAddressInfoBean addressInfoBean : bean.getAddressInfoBeans()) {
			addressInfoBean.getAddressPKBean().setEmpInfo(bean);
		}
		for (EmployeeEducationalInfo educationalInfo : bean.getEducationInfoBeans()) {
			educationalInfo.getEmpEducationInfo().setEmpInfo(bean);
		}
		for (EmployeeExperienceInfoBean experienceInfoBean : bean.getExperienceInfoBeans()) {
			experienceInfoBean.getEmpPKBean().setEmpInfo(bean);
		}
		EmployeeInfoBean manager = bean.getMngrId();
		manager = repository.findById(manager.getId()).get();
		bean.setMngrId(manager);

		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(bean.getId())) {

			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee data added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee data already exists");
		}
		return response;
	}
	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean) {
		bean.getEmployeeOtherInfo().setEmpInfo(bean);
		for (EmployeeAddressInfoBean addressInfoBean : bean.getAddressInfoBeans()) {
			addressInfoBean.getAddressPKBean().setEmpInfo(bean);
		}
		for (EmployeeEducationalInfo educationalInfo : bean.getEducationInfoBeans()) {
			educationalInfo.getEmpEducationInfo().setEmpInfo(bean);
		}
		for (EmployeeExperienceInfoBean experienceInfoBean : bean.getExperienceInfoBeans()) {
			experienceInfoBean.getEmpPKBean().setEmpInfo(bean);
		}
		EmployeeInfoBean manager = bean.getMngrId();
		manager = repository.findById(manager.getId()).get();
		bean.setMngrId(manager);

		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(bean.getId())) {

			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee data updated successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee data not updated");
		}
		return response;
	}

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(int id) {
		
		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(id)) {
			EmployeeInfoBean bean = repository.findById(id).get();
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee data found successfully");
			response.setBeans(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Successful");
			response.setDescription("Employee data not found");
		}
		return response;
	}
	@DeleteMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@RequestBody EmployeeInfoBean bean) {
		
		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(bean.getId())) {

			repository.delete(bean);
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee data deleted successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee data not deleted");
		}
		return response;
	}
	
}