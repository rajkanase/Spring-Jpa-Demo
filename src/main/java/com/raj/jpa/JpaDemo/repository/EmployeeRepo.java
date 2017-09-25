package com.raj.jpa.JpaDemo.repository;

import com.raj.jpa.JpaDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    List<Employee> findByNameAndCity(String name, String city);
    List<Employee> findByNameOrCity(String name, String city);

    List<Employee> findByIdBetween(Integer id1, Integer id2);

    List<Employee> findByIdLessThan(Integer id);

    List<Employee> findByIdGreaterThan(Integer id);

    List<Employee> findByIdAfter(Integer id);

    List<Employee> findByNameBefore(String name);

    List<Employee> findByNameLike(String name);

    List<Employee> findByNameStartingWith(String name);

    List<Employee> findByNameEndingWith(String name);

    List<Employee> findByCityContaining(String city);

    List<Employee> findByCityOrderByIdDesc(String city);

    List<Employee> findByCityOrderById(String city);
}
