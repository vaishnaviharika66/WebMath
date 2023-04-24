package com.excelr.WebMath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.excelr.pages.HomePage;

public class HomePageTest {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://webmath.com/");
		
		HomePage homepage = new HomePage(driver);
		homepage.validateHomePageTitle();
		homepage.clickonhomeButton();
		homepage.ClickonmathForEveryoneLink();
		homepage.clickongeneralMathLink();
		homepage.clickonk8MathLink();
		homepage.clickonalgebraLink();
		homepage.clickonplotsAndGeometryLink();
		homepage.clcikontrigoAndCalculuLink();
		homepage.clickonotherStuffLink();
		driver.quit();
		
		
	}

}
