package edu.cafe.controller;

import edu.cafe.dto.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    List<Customer> customerList = new ArrayList<>();

    @GetMapping("/get-customer")
    public List<Customer> getCustomerList(){
        customerList.add(new Customer(
                "C001",
                "Thisara",
                "Balangoda",
                779930534,
                "thisara23@gmail.com"
        ));

        customerList.add(new Customer(
                "C002",
                "Chamika",
                "Panadura",
                701130813,
                "chamika43@gmail.com"
        ));

        return customerList;
    }

    @PostMapping("/add-Customer")
    public Customer addCustomer(@RequestBody Customer customer){
        customerList.add(customer);
        return customer;
    }

}
