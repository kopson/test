package com.test;


import lombok.Data;

@Data
public class TestFeatures {
  private Long id = null;
  private Boolean feat1 = false;
  private Boolean feat2 = false;
  private String type = null;

  public TestFeatures() {}
}
