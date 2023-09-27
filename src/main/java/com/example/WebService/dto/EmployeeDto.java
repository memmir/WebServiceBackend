package com.example.WebService.dto;

import lombok.Data;

@Data
public class EmployeeDto {

    String id;
    String nameSurname;
    String password;
    String email;
    String address;
    int salary;
    String department;
    boolean remote;
}
