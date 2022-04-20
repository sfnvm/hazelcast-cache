package com.example.hazelcastcache.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Book implements Serializable {
  private Long id;

  private String bookname;
}
