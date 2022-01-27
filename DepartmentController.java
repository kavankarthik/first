package com.codebuffer.dailycodebuffer.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codebuffer.dailycodebuffer.entity.Department;
import com.codebuffer.dailycodebuffer.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentservice;
    //private final Logger LOGGER = LoggerFactory.getLogger(name:);
    
	@PostMapping("/department")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentservice.saveDepartment(department);
		
	}
	
	@GetMapping("/department")
	public List<Department> fetchdepartment(){
		
		return departmentservice.fetchdepartment();
		
			}
	
	@GetMapping("/department/{id}")
	public Department fetchDepartmentId(@PathVariable("id")Long id) {
		
		return departmentservice.fetchDepartmentId(id);
		
	}
	@DeleteMapping("/department/{id}")
	public String delete(@PathVariable("id")Long id) {
		departmentservice.deleteDepartmentById(id);
	return "Department id deleted successfully";
	}
	
	@PutMapping("/department/{id}")
	public Department updateDepartment(@PathVariable("id") Long id,@RequestBody Department department) {
	return departmentservice.updateDepartment(id,department);
			
	}
	@GetMapping("/department/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String name) {
	return departmentservice.fetchDepartmentByName(name);
		
	}
	
}
