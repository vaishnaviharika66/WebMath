package com.excelr.WebMath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.excelr.pages.AlgebraPage;

public class AlgebraPageTest {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://webmath.com/");
		driver.manage().window().maximize();
		
		 AlgebraPage algebra = new  AlgebraPage(driver);{
			 algebra.algebraLink();
			 algebra.clickonHelpLink();
		 }
	}
}