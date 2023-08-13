package com.andrekreou.employeeservice.service;

import com.andrekreou.employeeservice.dto.APIResponseDto;
import com.andrekreou.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
