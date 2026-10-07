package com.example.ShoppingMall.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShoppingMall.Entity.Customer;
import com.example.ShoppingMall.Service.Customerserv;

@RestController
public class Customercontrol {

    @Autowired
    private Customerserv cs;

    @PostMapping("/savecustomer")
    public Customer registercustomer(@RequestBody Customer c) {
        return cs.registercustomer(c);
    }

    @GetMapping("/getcustomer")
    public List<Customer> getcustomer() {
        return cs.getcustomers();
    }
    
 // UPDATE
    @PutMapping("/updatecustomer/{id}")
    public Customer updateCustomer(
            @PathVariable("id") Integer id,
            @RequestBody Customer customer) {

        return cs.updatecustomer(id, customer);
    }
    
    @DeleteMapping("/deletecustomer/{id}")
    public void deletecustomer(@PathVariable("id") Integer id) {
        cs.deletecustomer(id);
    }
}
