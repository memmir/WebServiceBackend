package com.example.WebService.controller;


import com.example.WebService.dto.EmployeeDto;
import com.example.WebService.service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/employee/getAll")
    public List<EmployeeDto> getAllEmployees(){
        return employeeService.getAllEmployees();
    }


    @PostMapping("/employee/getAllByRemote")
    public List<EmployeeDto> getAllEmployeesByRemote(){
        return employeeService.getAllRemoteEmployees(true);
    }


}
