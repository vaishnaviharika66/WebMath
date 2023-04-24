package com.excelr.WebMath;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.excelr.pages.GeneralMathPage;
import com.excelr.pages.HomePage;

public class GeneralMathPageTest {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://webmath.com/");

		GeneralMathPage generalmathpage = new GeneralMathPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		generalmathpage.clickonGeneralMathLink();
		generalmathpage.clickonIntrestSimple();
//	generalmathpage.clickonGoBtn();
		generalmathpage.typePrincipal("50000");
		generalmathpage.typeintrest("10");
		generalmathpage.typeYear("1");
		generalmathpage.clickonFindAmountOfIntrest();
	}

}
