package com.example.WebService.controller;


import com.example.WebService.dto.EmployeeDto;
import com.example.WebService.service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("/employee/saveEmployee")
    public void saveEmployee(@RequestBody EmployeeDto employeeDto){
        employeeService.saveEmployee(employeeDto);
    }


    @PostMapping("/employee/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);
    }


    @PostMapping("/employee/findById/{id}")
    public void findEmployeeById(@PathVariable String id){
         employeeService.findEmployeeById(id);
    }

}
