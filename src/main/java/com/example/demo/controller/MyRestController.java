package com.example.demo.controller;
import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;




@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class MyRestController {

private List<Customer> employees = createList();

@RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")

public List<Customer> firstPage() {

return employees;

}

private static List<Customer> createList() {

List<Customer> tempEmployees = new ArrayList<>();

Customer emp1 = new Customer();

emp1.setFirstname("abc");
emp1.setCell_no("0300");
emp1.setCnic("ss");
emp1.setAddress("ad");
emp1.setLastname("xyz");
emp1.setUsername("Ab");
emp1.setPassword("ss");

Customer emp2 = new Customer();

emp2.setFirstname("abc");
emp2.setCell_no("0300");
emp2.setCnic("ss");
emp2.setAddress("ad");
emp2.setLastname("xyz");
emp2.setUsername("Ab");
emp2.setPassword("ss");

tempEmployees.add(emp1);

tempEmployees.add(emp2);

return tempEmployees;

}
}

