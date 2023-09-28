package com.example.WebService.service;

import com.example.WebService.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    public List<EmployeeDto> getAllRemoteEmployees(boolean remote);

    public List<EmployeeDto> getAllEmployees();

    public void saveEmployee (EmployeeDto employeeDto);

    public void deleteEmployee ( String id );

    public EmployeeDto findEmployeeById(String id);

}
