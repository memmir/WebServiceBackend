
package com.example.WebService.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="employee" , schema = "public")
public class Employee {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

    @Column
    String nameSurname;

    @Column
    String password;

    @Column
    String email;

    @Column
    String address;

    @Column
    int salary;

    @Column
    String department;

    @Column
    boolean remote;
}

