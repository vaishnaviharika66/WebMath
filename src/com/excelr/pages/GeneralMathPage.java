package com.excelr.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralMathPage {
	WebDriver driver;
	By generalMathLink = By.xpath("//a[text()='General Math']");
	By mathhelpdropDown = (By.cssSelector("select[id *='topicItem']"));
	By intrestsimple = By
			.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/form[2]/div/select/option[54]");
	By gobtn = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/div/a/img");
	By principal = By.xpath("//input[@name='principal']");
	By intrest = By.xpath("//input[@name='interest']");
	By year = By.xpath("//input[@name='desired_time']");
	By findtheamountofintrest = By.cssSelector("input[value='Find the amount of interest']");

	public GeneralMathPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickonGeneralMathLink() {
		driver.findElement(generalMathLink).click();
	}

	public void clickonMathHelpdropDown() {
		driver.findElement(mathhelpdropDown).click();
	}

	public void clickonIntrestSimple() {
		driver.findElement(intrestsimple).click();
	}

	public void clickonGoBtn() {
		driver.findElement(gobtn).click();
	}

	public void typePrincipal(String pri_data) {
		driver.findElement(principal).sendKeys(pri_data);
	}

	public void typeintrest(String intrest_data) {
		driver.findElement(intrest).sendKeys(intrest_data);
	}

	public void typeYear(String time_period) {
		driver.findElement(year).sendKeys(time_period);
	}

	public void clickonFindAmountOfIntrest() {
		driver.findElement(findtheamountofintrest).click();
	}

}
