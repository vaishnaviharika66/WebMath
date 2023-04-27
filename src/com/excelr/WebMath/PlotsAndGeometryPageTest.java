package com.excelr.WebMath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.excelr.pages.PlotsAndGeometryPage;

public class PlotsAndGeometryPageTest {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://webmath.com/");
		driver.manage().window().maximize();
		PlotsAndGeometryPage plotsgeometrypage = new PlotsAndGeometryPage( driver); {
			plotsgeometrypage.clickonPlotsAndGeometry();
			plotsgeometrypage.clickonGeneralMathLink();
			plotsgeometrypage.clickonGobtn();
		}
		
		
		
	}

}
