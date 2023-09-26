
package com.example.WebService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @Column
    String id;

    @Column
    String name;

    @Column
    String surname;

    @Column
    String address;

    @Column
    int salary;

    @Column
    String department;

    @Column
    boolean remote;
}

