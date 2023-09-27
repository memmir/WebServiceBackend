package com.example.WebService.repository;


import com.example.WebService.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,String> {


    @Query("SELECT e FROM Employee e WHERE e.remote = ?1" )
    List<Employee> findAllByRemote(String id);

    //@Query("SELECT * FROM Employee")
    List<Employee> findAll();





}
