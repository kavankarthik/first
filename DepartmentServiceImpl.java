package com.codebuffer.dailycodebuffer.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebuffer.dailycodebuffer.entity.Department;
import com.codebuffer.dailycodebuffer.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
		
	}
	@Override
	public List<Department> fetchdepartment() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}
	@Override
	public Department fetchDepartmentId(Long id) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(id).get();
		
	}
	@Override
	public void deleteDepartmentById(Long id) {
		// TODO Auto-generated method stub
		
		departmentRepository.deleteById(id);
	}
	@Override
	public Department updateDepartment(Long id, Department department) {
		// TODO Auto-generated method stub
		Department depdb = departmentRepository.findById(id).get();
		if(Objects.nonNull(department.getName()))
		{
			depdb.setName(department.getName());
		}
		if(Objects.nonNull(department.getAddress()))
		{
			depdb.setAddress(department.getAddress());
		}
		return departmentRepository.save(depdb);
				
	}
	@Override
	public Department fetchDepartmentByName(String name) {
		// TODO Auto-generated method stub
	return departmentRepository.findByName(name);
	}
	
}
 