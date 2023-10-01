package com.example.WebService.repository;


import com.example.WebService.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,String> {


    @Query("SELECT e FROM Employee e WHERE e.remote = ?1" )
    List<Employee> findAllByRemote(boolean remote);

    //@Query("SELECT * FROM Employee")
    List<Employee> findAll();

    void deleteById(String id);

    @Query("SELECT e FROM Employee e where e.id = ?1")
    Employee findEmployeeById(String id);





}
