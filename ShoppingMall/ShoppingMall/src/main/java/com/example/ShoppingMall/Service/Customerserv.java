package com.example.ShoppingMall.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShoppingMall.Entity.Customer;
import com.example.ShoppingMall.Repository.Customerrepo;

@Service
public class Customerserv {

    @Autowired
    private Customerrepo cr;

    // create

    public Customer registercustomer(Customer c) {
        return cr.save(c);
    }

    // read

    public List<Customer> getcustomers() {
        return (List<Customer>) cr.findAll();
    }
    
 // UPDATE
    public Customer updatecustomer(Integer id, Customer s) {

        Customer existing = cr.findById(id).orElse(null);

        if (existing != null) {

            existing.setName(s.getName());
            existing.setPhonenumber(s.getPhonenumber());
            existing.setDesignation(s.getDesignation());

            return cr.save(existing);
        }

        return null;
    }
    // delete

    public void deletecustomer(Integer id) {
        cr.deleteById(id);
    }
}