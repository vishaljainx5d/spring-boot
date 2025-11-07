package com.springboot.amigoscode.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }

    record NewCustomerRequest(String name, String email, Integer age) {}

    public void addCustomer(NewCustomerRequest request) {
        customerRepository.save(mapToCustomerEntity(request));
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

    private CustomerEntity mapToCustomerEntity(NewCustomerRequest request) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setName(request.name);
        customerEntity.setEmail(request.email);
        customerEntity.setAge(request.age);
        return customerEntity;
    }
}
