package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestCases {
  @Test
  public void test1() {
	  System.out.println("Test1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before T");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After T");
  }

}
