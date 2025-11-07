package com.springboot.amigoscode.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    List<CustomerEntity> getAllCustomers();
    void addCustomer(CustomerServiceImpl.NewCustomerRequest request);
    void deleteCustomer(Integer id);
}
