package com.andrekreou.departmentservice.service.impl;

import com.andrekreou.departmentservice.dto.DepartmentDto;
import com.andrekreou.departmentservice.entity.Department;
import com.andrekreou.departmentservice.mapper.DepartmentMapper;
import com.andrekreou.departmentservice.repository.DepartmentRepository;
import com.andrekreou.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        return DepartmentMapper.mapToDepartmentDto(department);
    }
}
