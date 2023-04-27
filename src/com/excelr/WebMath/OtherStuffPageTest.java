package com.excelr.WebMath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.excelr.pages.OtherStuffPage;

public class OtherStuffPageTest {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://webmath.com/");
		driver.manage().window().maximize();
		
		OtherStuffPage otherstuff = new OtherStuffPage(driver);{
			otherstuff.clickonOtherStuffLink();
			otherstuff.clickonSampledata();
			otherstuff.clickonDataAnalysis();
			otherstuff.clickonRadioButton();
			otherstuff.clickonResetbtn();
			
		}
	}

}
