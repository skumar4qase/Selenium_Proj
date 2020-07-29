package com.example;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First extends Second{

public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	
	WebDriver wd = new ChromeDriver();
	wd.get("http://adactinhotelapp.com/");
	
}


}
