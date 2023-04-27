package com.excelr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class K8MathPage {
	WebDriver driver ;
	By k8MathLink = By.xpath("//a[text()='K-8 Math']");
	By mathhelpdropDown = (By.cssSelector("select[id *='topicItem']"));
	By numdiv = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/form[2]/div/select/option[66]");
	By divide = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/b/form/center/input");
	By fractioncomparing = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/form[2]/div/select/option[28]");
	By numerator1 = By.xpath("//input[@name='n1']");
	By denomenator1= By.xpath("//input[@name='d1']");
	By numerator2 = By.xpath("//input[@name='n2']");
	By denomenator2 = By.xpath("//input[@name='d2']");
	By larger = By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/form/center/center/center/input");

	public K8MathPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickonk8MathLink() {
		driver.findElement(k8MathLink).click();
	}
//	enter the drop down
	public void clickonMathHelpdropdown() {
		driver.findElement(mathhelpdropDown).click();
	}
//	select Numbers Dividing
	public void selectNumberDivide() {
		driver.findElement(numdiv).click();
	}
//	click on divide it should display error page
	public void clickonDivide() {
		driver.findElement(divide).click();
	}
//	select Fractions Comparing
	public void selectFractionComparing() {
		driver.findElement(fractioncomparing).click();
		
	}
//	enter values to boxes to compare which one is larger
	public void typeNumerator1(String num1) {
		driver.findElement(numerator1).sendKeys(num1);
	}
	public void typeDenominator1(String num2) {
		driver.findElement(denomenator1).sendKeys(num2);		
	}
	public void typeNumerator2(String num3) {
		driver.findElement(numerator2).sendKeys(num3);
	}
	public void typeDenominator2(String num4) {
		driver.findElement(denomenator2).sendKeys(num4);
	}
// it should display both digits are equal
	public void clickonWhichisLarger() {
		driver.findElement(larger).click();
	}
}
