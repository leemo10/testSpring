package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by leemorris on 25/08/2016.
 */
public interface CustomerService {
    List<Customer> findAll();
}
