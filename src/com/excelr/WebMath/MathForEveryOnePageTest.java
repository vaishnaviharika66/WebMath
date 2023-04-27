package com.excelr.WebMath;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.excelr.pages.MathForEveryOnePage;

public class MathForEveryOnePageTest {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://webmath.com/");
		
		MathForEveryOnePage mathpage = new MathForEveryOnePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		mathpage.clickonMathForEveryone();
		mathpage.clickonMathHelpdropdown();
		mathpage.selectConversionvol();
		mathpage.typeValue("20");
		mathpage.clickonLiters();
		mathpage.clickonMilliLiters();
		mathpage.clickonConvert();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		mathpage.clickonBackbtn();
		mathpage.enterData("6");
		mathpage.selectLiter();
		mathpage.chooseLiters();
		mathpage.Convert();
		
	}
}
