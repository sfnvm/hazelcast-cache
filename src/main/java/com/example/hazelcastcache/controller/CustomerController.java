package com.example.hazelcastcache.controller;

import com.example.hazelcastcache.model.Customer;
import com.example.hazelcastcache.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customers")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CustomerController {
  private final CustomerService customerService;

  @GetMapping("{name}")
  public ResponseEntity<Customer> getCustomerByName(@PathVariable("name") String name)
  throws Exception {
    return ResponseEntity.ok(customerService.findByName(name));
  }

  @PostMapping("{name}")
  public ResponseEntity<Customer> createCustomer(@PathVariable("name") String name) {
    return ResponseEntity.ok(customerService.create(name));
  }
}
