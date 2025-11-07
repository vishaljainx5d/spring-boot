package com.springboot.amigoscode.customer;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/vi")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customers")
    public List<CustomerEntity> getCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/saveCustomer")
    public String addCustomer(@RequestBody CustomerServiceImpl.NewCustomerRequest request) {
        customerService.addCustomer(request);
        return "Customer added successfully!";
    }

    @PostMapping("/deleteCustomer/{customerId}")
    public String deleteCustomer(@PathVariable("customerId") Integer customerId) {
        customerService.deleteCustomer(customerId);
        return "Customer deleted successfully!";
    }
}
