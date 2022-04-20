package com.example.hazelcastcache.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CacheService {
  @Cacheable("books")
  public String getBookNameByIsbn(String isbn) {
    log.info("cache miss with key {}", isbn);
    return findBookInSlowSource(isbn);
  }

  private String findBookInSlowSource(String isbn) {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
      Thread.currentThread().interrupt();
    }
    return String.format("Sample Book Name %s", isbn);
  }
}
