package com.pranaysahu.employeeservice.repository;

import com.pranaysahu.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
