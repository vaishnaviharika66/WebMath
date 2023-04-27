package com.excelr.WebMath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.excelr.pages.TrigoAndCalculuPage;

public class TrigoAndCalculuPageTest {
	public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://webmath.com/");
	driver.manage().window().maximize();
	
	TrigoAndCalculuPage calculaspage=new TrigoAndCalculuPage(driver);{
		calculaspage.clickonTrigoAndCalculuLink();
		calculaspage.clickonGeneralMathLink();
		calculaspage.clickonNumPro();
		calculaspage.typeNumber("06");
		calculaspage.clickonPronounce();
		calculaspage.clickonBackbtn();
		calculaspage.typeNumber("Two");
//		it shows error as Zero
		calculaspage.clickonPronounce(); 
		driver.quit();
		
		
	}
}
}