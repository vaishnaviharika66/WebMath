package com.excelr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlgebraPage {
	WebDriver driver;
	By algebraLink = By.xpath("//a[text()='Algebra']");
	By helplink = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[2]/a");

	public AlgebraPage(WebDriver driver) {
		this.driver = driver;
	}

	public void algebraLink() {
		driver.findElement(algebraLink).click();

	}

//	it should display answer site
	public void clickonHelpLink() {
		driver.findElement(helplink).click();

	}

}
