package com.excelr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OtherStuffPage {
	WebDriver driver;
	By otherStuffLink = By.xpath("//a[text()='Other Stuff']");
	By sampledata = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[1]/font/font/a[4]");
	By dataanalysis = By.xpath("//a[text()='data analysis']");
	By radiobutton = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/form/center/table/tbody/tr/td/p[4]/input[3]");
	By resetbtn = By.xpath("<input type=\"reset\" value=\"Reset this form\">");
	
	public OtherStuffPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickonOtherStuffLink() {
		driver.findElement(otherStuffLink).click();
	}
//	click sample data link
	public void clickonSampledata() {
		driver.findElement(sampledata).click();
	}
//	click on data analysis link
	public void clickonDataAnalysis() {
		driver.findElement(dataanalysis).click();		
	}
//	choose option 3
	public void clickonRadioButton() {
		driver.findElement(radiobutton).click();		
	}
//	click on reset the form all data will errase.
	public void clickonResetbtn() {
		driver.findElement(resetbtn).click();
	}
	

}
