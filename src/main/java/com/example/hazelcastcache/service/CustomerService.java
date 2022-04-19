package com.example.hazelcastcache.service;

import com.example.hazelcastcache.model.Customer;
import com.example.hazelcastcache.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CustomerService {
  private final CustomerRepository customerRepository;

  @Cacheable("customer")
  public Customer findByName(String name) throws Exception {
    log.info("cache miss");
    return customerRepository.findByName(name).orElseThrow(() -> new Exception("not found"));
  }
}
