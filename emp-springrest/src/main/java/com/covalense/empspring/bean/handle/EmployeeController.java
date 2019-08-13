package com.covalense.empspring.bean.handle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.empspring.beans.EmployeeInfo;
import com.covalense.empspring.dao.EmployeeDAO;

@RestController
@RequestMapping("/employeerest")
public class EmployeeController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	@GetMapping("/getAllEmployee")
	public @ResponseBody List<EmployeeInfo> getAllEmployeexml(){
		return dao.getAllEmployeeInfo();
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}
	@PostMapping(path="/createEmployee")
	public @ResponseBody boolean createEmployee(@RequestBody EmployeeInfo employeeInfo) {
		return dao.createEmployeeInfo(employeeInfo);
		
	}
	@PutMapping(path="/updateEmployee")
	public @ResponseBody boolean updateEmployee(@RequestBody EmployeeInfo employeeInfo) {
		return dao.updateEmployeeInfo(employeeInfo);
		
	}
	@DeleteMapping(path="/deleteEmployee")
	public @ResponseBody boolean deleteEmployee(@RequestParam("id") int id) {
		return dao.deleteEmployeeInfo(id);
		
	}
	@GetMapping(value="/getEmployee",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody EmployeeInfo getEmployee(@RequestParam("id") int id) {
		return dao.getEmployeeInfo(id);
		
	}
	
}
