package com.codebuffer.dailycodebuffer.service;


import java.util.List;

import com.codebuffer.dailycodebuffer.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchdepartment();

	public Department fetchDepartmentId(Long id);

	public void deleteDepartmentById(Long id);

	public Department updateDepartment(Long id, Department department);

	public Department fetchDepartmentByName(String name);

	

		

} 
