package com.raj.jpa.JpaDemo.controller;

import com.raj.jpa.JpaDemo.model.Employee;
import com.raj.jpa.JpaDemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmplController {

    @Autowired
    EmployeeRepo employeeRepo;

    @PostMapping(value = "/savedata")
    String savedata(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Data saved successfully...!";
    }

    @GetMapping(value = "/getdata/{id}")
    Employee data(@PathVariable Integer id){
        Employee emp=employeeRepo.findOne(id);
        return emp;
    }

    @GetMapping(value = "/getalldata")
    List<Employee> data(){
        List<Employee> list=employeeRepo.findAll();
        return list;
    }

    @GetMapping(value = "/getone")
    Employee dataEmp(){
        Employee emp=employeeRepo.getOne(1);
        return emp;
       // employeeRepo.
    }

    @GetMapping(value = "/getnameandcity")
    List<Employee> dataobj(@RequestParam String name, @RequestParam String city){
        List<Employee> list=employeeRepo.findByNameAndCity(name,city);
        return list;
    }

    @GetMapping(value = "/getnameorcity")
    List<Employee> dataOr(@RequestParam String name,@RequestParam String city){
        List<Employee> list=employeeRepo.findByNameOrCity(name,city);
        return list;
    }

    @GetMapping(value = "/getidbetween")
    List<Employee> databet(@RequestParam Integer id1, @RequestParam Integer id2){
        List<Employee> list=employeeRepo.findByIdBetween(id1,id2);
        return list;
    }

    @GetMapping(value = "/getlessthan")
    List<Employee> getless(@RequestParam Integer id){
        List<Employee> list=employeeRepo.findByIdLessThan(id);
        return list;
    }


    @GetMapping(value = "/getgreaterthan")
    List<Employee> getgreater(@RequestParam Integer id){
        List<Employee> list=employeeRepo.findByIdGreaterThan(id);
        return list;
    }

    @GetMapping(value = "/getafter")
    List<Employee> getafter(@RequestParam Integer id){
        List<Employee> list=employeeRepo.findByIdAfter(id);
        return list;
    }

    @GetMapping(value = "/getbefore")
    List<Employee> getbefore(@RequestParam String name){
        List<Employee> list=employeeRepo.findByNameBefore(name);
        return list;
    }

    @GetMapping(value = "/getlike")
    List<Employee> getlike(@RequestParam String name){
        List<Employee> list=employeeRepo.findByNameLike(name);
        return list;
    }

    @GetMapping(value = "/getstartfrom")
    List<Employee> getstartfrom(@RequestParam String name){
        List<Employee> list=employeeRepo.findByNameStartingWith(name);
        return list;
    }

    @GetMapping(value = "/getendwith")
    List<Employee> getendwith(@RequestParam String name){
        List<Employee> list=employeeRepo.findByNameEndingWith(name);
        return list;
    }

    @GetMapping(value = "/getcontain")
    List<Employee> getcontain(@RequestParam String city){
        List<Employee> list=employeeRepo.findByCityContaining(city);
        return list;
    }

    @GetMapping(value = "/getbyorderdesc")
    List<Employee> getbyorder(@RequestParam String city){
        List<Employee> list=employeeRepo.findByCityOrderByIdDesc(city);
        return list;
    }

    @GetMapping(value = "/getbyorderasc")
    List<Employee> getbyorderasc(@RequestParam String city){
        List<Employee> list=employeeRepo.findByCityOrderById(city);
        return list;
    }



}
