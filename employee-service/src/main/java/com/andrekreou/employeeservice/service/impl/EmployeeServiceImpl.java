package com.andrekreou.employeeservice.service.impl;

import com.andrekreou.employeeservice.dto.EmployeeDto;
import com.andrekreou.employeeservice.entity.Employee;
import com.andrekreou.employeeservice.repository.EmployeeRepository;
import com.andrekreou.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );

        Employee savedEmployee =  employeeRepository.save(employee);

        return new EmployeeDto(
                savedEmployee.getId(),
                savedEmployee.getFirstName(),
                savedEmployee.getLastName(),
                savedEmployee.getEmail()
        );
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {

        Employee employee =  employeeRepository.findById(employeeId).get();

        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
}
