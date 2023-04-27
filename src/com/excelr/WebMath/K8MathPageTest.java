package com.excelr.WebMath;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.excelr.pages.K8MathPage;

public class K8MathPageTest {
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://webmath.com/");

		driver.manage().window().maximize();
		K8MathPage k8page = new K8MathPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		k8page.clickonk8MathLink();
		k8page.clickonMathHelpdropdown();
		k8page.selectNumberDivide();
		k8page.clickonDivide();
		k8page.clickonk8MathLink();
		k8page.clickonMathHelpdropdown();
		k8page.selectFractionComparing();
		k8page.typeNumerator1("4");
		k8page.typeDenominator1("16");
		k8page.typeNumerator2("5");
		k8page.typeDenominator2("20");
		k8page.clickonWhichisLarger();
	}

}
