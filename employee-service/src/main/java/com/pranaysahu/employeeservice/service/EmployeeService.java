package com.pranaysahu.employeeservice.service;

import com.pranaysahu.employeeservice.dto.APIResponseDto;
import com.pranaysahu.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
