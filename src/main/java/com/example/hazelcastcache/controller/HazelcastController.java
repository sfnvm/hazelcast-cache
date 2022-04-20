package com.example.hazelcastcache.controller;

import com.example.hazelcastcache.service.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hazel-cast")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class HazelcastController {
  private final CacheService cacheService;

  @GetMapping
  public ResponseEntity<String> testCache() {
    return ResponseEntity.ok(cacheService.getBookNameByIsbn("test"));
  }
}
