package com.greatlearning.employeemgnmnt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemgnmnt.model.Employee;


public interface EmployeeInterface extends JpaRepository<Employee, Integer> {
}