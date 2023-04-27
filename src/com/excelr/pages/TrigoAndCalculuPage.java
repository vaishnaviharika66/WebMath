package com.excelr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrigoAndCalculuPage {
	WebDriver driver;
	By trigoAndCalculuLink = By.xpath("//a[text()='Trig. & Calculus']");
	By generalMathLink = By.xpath("//a[text()='General Math']");
	By numpro = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/form[2]/div/select/option[71]");
	By number = By.xpath("//input[@name='number']");

	By pronounce = By.xpath(
			"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[2]/input");
	By backbtn = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/a/img");

	public  TrigoAndCalculuPage(WebDriver driver){
		this.driver=driver;
	}
	public void clickonTrigoAndCalculuLink() {
		driver.findElement(trigoAndCalculuLink).click();
	}
	public void clickonGeneralMathLink() {
		driver.findElement(generalMathLink).click();
	}
//	select Numbers Pronouncing
	public void clickonNumPro() {
		driver.findElement(numpro).click();
	}
//	enter the number
	public void typeNumber(String num) {
		driver.findElement(number).sendKeys(num);
	}
//	it should display number in words
	public void clickonPronounce() {
		driver.findElement(pronounce).click();
	}
//	click on back to math problem
	public void clickonBackbtn() {
		driver.findElement(backbtn).click();
	}
	}


