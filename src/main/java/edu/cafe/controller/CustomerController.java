package edu.cafe.controller;

import edu.cafe.dto.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    List<Customer> customerList = new ArrayList<>();

    @GetMapping("/get-all-customers")
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

    @PostMapping("/add-customer")
    public Customer addCustomer(@RequestBody Customer customer){
        customerList.add(customer);
        return customer;
    }

    @GetMapping("/customer-id")
    public List<String> getAllCustomerIds(){

        List<String> idsList = new ArrayList<>();

        customerList.forEach(customer -> {
            idsList.add(customer.getId());
        });

        return idsList;
    }

    @GetMapping("/phone-numbers")
    public List<Integer> getAllPhoneNumber(){

        List<Integer> numberList = new ArrayList<>();

        customerList.forEach(customer -> {
            numberList.add(customer.getPhoneNumber());
        });
        return numberList;
    }

    @DeleteMapping("/delete-customer")
    public void deleteCustomer(@RequestBody String id){
        for (int i=0; i<customerList.size();i++){
            if (customerList.get(i).getId()==id){
                customerList.remove(i);
            }
        }
    }


}
