package com.excelr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlotsAndGeometryPage {
	WebDriver driver;
	 By plotsAndGeometryLink  = By.xpath("//a[text()='Plots & Geometry']");
	 By generalMathLink = By.xpath("//a[text()='General Math']");
	 By gobtn = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div/div[1]/div[1]/div/div[4]/form/div/a/img");
	 
	 public PlotsAndGeometryPage(WebDriver driver) {
		 this.driver=driver;
	 }
	 public  void clickonPlotsAndGeometry() {
		driver.findElement(plotsAndGeometryLink).click();
	 }
	 public void clickonGeneralMathLink() {
		 driver.findElement(generalMathLink).click();
	 }
//	 it should display Welcome to Webmath
	 public void clickonGobtn() {
		 driver.findElement(gobtn).click();
	 }

}
