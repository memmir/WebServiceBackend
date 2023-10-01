package com.example.WebService.service;


import com.example.WebService.dto.EmployeeDto;
import com.example.WebService.entity.Employee;
import com.example.WebService.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeDto> getAllRemoteEmployees(boolean remote){

        List<Employee> employeeList = employeeRepository.findAllByRemote(remote);
        List<EmployeeDto> employeeDtoList = new ArrayList<>();

        employeeList.stream().forEach( employee -> {
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setId(employee.getId());
            employeeDto.setNameSurname(employee.getNameSurname());
            employeeDto.setPassword(employee.getPassword());
            employeeDto.setEmail(employee.getEmail());
            employeeDto.setAddress(employee.getAddress());
            employeeDto.setSalary(employee.getSalary());
            employeeDto.setDepartment(employee.getDepartment());
            employeeDto.setRemote(employee.isRemote());

            employeeDtoList.add(employeeDto);

        });

        return employeeDtoList;

    }

    @Override
    public List<EmployeeDto> getAllEmployees(){

        List<Employee> employeeList = employeeRepository.findAll();
        List<EmployeeDto> employeeDtoList = new ArrayList<>();

        employeeList.stream().forEach( employee -> {

            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setId(employee.getId());
            employeeDto.setNameSurname(employee.getNameSurname());
            employeeDto.setPassword(employee.getPassword());
            employeeDto.setEmail(employee.getEmail());
            employeeDto.setAddress(employee.getAddress());
            employeeDto.setSalary(employee.getSalary());
            employeeDto.setDepartment(employee.getDepartment());
            employeeDto.setRemote(employee.isRemote());

            employeeDtoList.add(employeeDto);

        });

        return employeeDtoList;
    }

    @Override
    @Transactional
    public void saveEmployee (EmployeeDto employeeDto){
        Employee employee = new Employee();

        employee.setId(employeeDto.getId());
        employee.setNameSurname(employeeDto.getNameSurname());
        employee.setPassword(employeeDto.getPassword());
        employee.setEmail(employeeDto.getEmail());
        employee.setAddress(employeeDto.getAddress());
        employee.setSalary(employeeDto.getSalary());
        employee.setDepartment(employeeDto.getDepartment());
        employee.setRemote(employeeDto.isRemote());

        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee ( String id ){

        Employee employee = employeeRepository.findEmployeeById(id);

        employeeRepository.delete(employee);

    }

    @Override
    public EmployeeDto findEmployeeById(String id){

        Employee employee = employeeRepository.findEmployeeById(id);
        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setId(employee.getId());
        employeeDto.setNameSurname(employee.getNameSurname());
        employeeDto.setPassword(employee.getPassword());
        employeeDto.setEmail(employee.getEmail());
        employeeDto.setAddress(employee.getAddress());
        employeeDto.setSalary(employee.getSalary());
        employeeDto.setDepartment(employee.getDepartment());
        employeeDto.setRemote(employee.isRemote());

        return employeeDto;

    }

}
