package com.example.hazelcastcache.controller;

import com.example.hazelcastcache.model.Customer;
import com.example.hazelcastcache.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CustomerController {
  private final CustomerService customerService;

  @GetMapping("/{name}")
  public ResponseEntity<Customer> getCustomerByName(@PathVariable("name") String name)
  throws Exception {
    return ResponseEntity.ok(customerService.findByName(name));
  }
}
