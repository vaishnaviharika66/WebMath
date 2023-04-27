package com.excelr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MathForEveryOnePage {
	WebDriver driver;
	 By mathForEveryoneLink = By.xpath("//a[text()='Math for Everyone']");
	 By mathhelpdropDown = (By.cssSelector("select[id *='topicItem']"));
	 By con_vol = By .xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/form[2]/div/select/option[18]");
	  By value = By.xpath("//input[@name='param0']");
	  By liters = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/font/b/form/center/p[1]/select/option[8]");
	  By milliliters = By .xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/font/b/form/center/p[3]/select/option[9]");
	  By convert = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/font/b/form/center/p[3]/input[1]");
	  By backtobtn=By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/a/img");
	  By data = By.xpath("//input[@name='param0']");
	  By selectliters = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/font/b/form/center/p[1]/select/option[8]");
	  By chooseliters=By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/font/b/form/center/p[3]/select/option[8]");
	  By convertbtn = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/font/b/form/center/p[3]/input[1]");
	  
	  
	  public MathForEveryOnePage(WebDriver driver) {
		  this .driver=driver;
	  }
	  public void clickonMathForEveryone() {
		  driver.findElement(mathForEveryoneLink).click();
	  }
	  public void clickonMathHelpdropdown() {
		  driver.findElement(mathhelpdropDown).click();
	  }
	  public void selectConversionvol() {
		  driver.findElement(con_vol).click();	  	  
	  }
	  public void typeValue(String liters_value ) {
		  driver.findElement(value).sendKeys(liters_value);
	  }
	  public void clickonLiters() {
		  driver.findElement(liters).click();
	  }
	  public void clickonMilliLiters() {
		  driver.findElement(milliliters).click();
	  }
	  public void clickonConvert() {
		  driver.findElement(convert).click();
	  }
	  public void clickonBackbtn() {
		  driver.findElement(backtobtn).click();	  
	  }
	  public void enterData(String pass_value) {
		  driver.findElement(data).sendKeys(pass_value);	  
	  }
	  public void selectLiter() {
		  driver.findElement(selectliters).click();		  
	  }
	  public void chooseLiters() {
		  driver.findElement(chooseliters).click();
		  
	  }
	  public void Convert() {
		  driver.findElement(convertbtn).click();
	  }
}
