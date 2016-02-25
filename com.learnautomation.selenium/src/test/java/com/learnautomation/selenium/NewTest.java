package com.learnautomation.selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	  FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	  FirefoxProfile firefoxProfile = new FirefoxProfile();       
	  WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
	  driver.get("http://www.google.com");
	  driver.close();
  }
}
