package com.example.ShoppingMall.Repository;
import org.springframework.data.repository.CrudRepository;
import com.example.ShoppingMall.Entity.Customer;
public interface Customerrepo extends CrudRepository<Customer, Integer> {

}

