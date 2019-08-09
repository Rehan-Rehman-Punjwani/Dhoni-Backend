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

private List<Customer> customers = createList();

@RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")

public List<Customer> firstPage() {

return customers;

}

private static List<Customer> createList() {

List<Customer> tempEmployees = new ArrayList<>();

Customer emp1 = new Customer();

emp1.setId(1);
emp1.setFirstname("Saad");
emp1.setCell_no("0300-000054");
emp1.setCnic("42101-50362411-1");
emp1.setEmail("msaad03@techlogix.com");
emp1.setAddress("LightHouse");
emp1.setLastname("Memon");
emp1.setUsername("saad_khan");
emp1.setPassword("ss");

Customer emp2 = new Customer();

emp2.setId(2);
emp2.setFirstname("Basit");
emp2.setEmail("basit_khatri@techlogix.com");
emp2.setCell_no("0300-26644667");
emp2.setCnic("42101-556844732-1");
emp2.setAddress("Safoora");
emp2.setLastname("Khatri");
emp2.setUsername("k164225");
emp2.setPassword("ss");

tempEmployees.add(emp1);

tempEmployees.add(emp2);

return tempEmployees;

}
}

