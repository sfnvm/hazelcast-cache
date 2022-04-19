package com.example.hazelcastcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HazelCastCacheApplication {
  public static void main(String[] args) {
    SpringApplication.run(HazelCastCacheApplication.class, args);
  }
}
