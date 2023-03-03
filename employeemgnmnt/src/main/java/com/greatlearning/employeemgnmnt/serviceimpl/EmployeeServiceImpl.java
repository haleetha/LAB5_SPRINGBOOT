package com.greatlearning.employeemgnmnt.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemgnmnt.model.Employee;
import com.greatlearning.employeemgnmnt.repository.EmployeeInterface;
import com.greatlearning.employeemgnmnt.service.EmployeeService;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeInterface repository;

	@Override
	public List<Employee> getAllEmployees() {

		return repository.findAll();
	}

	@Override
	public void saveOrUpdate(Employee theEmployee) {

		repository.save(theEmployee);
	}

	@Override
	public Employee getEmployeeById(int theId) {

		return repository.findById(theId).get();
	}

	@Override
	public void deleteEmployeeById(int theId) {

		Employee emp = getEmployeeById(theId);
		repository.delete(emp);
	}

}