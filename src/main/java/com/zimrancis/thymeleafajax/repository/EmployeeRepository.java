package com.zimrancis.thymeleafajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zimrancis.thymeleafajax.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
