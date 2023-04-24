package com.excelr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver ;
	 By homebutton = By.xpath("//div[@id = 'navBox-0']");
	 By mathForEveryoneLink = By.xpath("//a[text()='Math for Everyone']");
	 By generalMathLink = By.xpath("//a[text()='General Math']");
	 By k8MathLink = By.xpath("//a[text()='K-8 Math']");
	 By algebraLink = By.xpath("//a[text()='Algebra']");
	 By plotsAndGeometryLink  = By.xpath("//a[text()='Plots & Geometry']");
	 By trigoAndCalculuLink = By .xpath("//a[text()='Trig. & Calculus']");
	 By otherStuffLink = By.xpath("//a[text()='Other Stuff']");
	
	 public HomePage(WebDriver driver) {
		 this .driver = driver;
	 }
	 public String validateHomePageTitle() {
			return driver.getTitle();
		}
	 public void clickonhomeButton() {
		 driver.findElement(homebutton).click();
	 } 
	 public MathForEveryOnePage ClickonmathForEveryoneLink() {
	 driver.findElement(generalMathLink).click();
	 return new MathForEveryOnePage();
	 }
	 public GeneralMathPage clickongeneralMathLink(){
		 driver.findElement(generalMathLink).click();
		 return new GeneralMathPage(driver);
	 }
	 public K8MathPage clickonk8MathLink() {
		 driver.findElement(k8MathLink).click();
		 return new K8MathPage();
	 }
	 public AlgebraPage clickonalgebraLink() {
		 driver.findElement(algebraLink);
		 return new AlgebraPage();
	 }
	 public PlotsAndGeometryPage clickonplotsAndGeometryLink() {
		 driver.findElement(plotsAndGeometryLink).click();
		 return new PlotsAndGeometryPage();
	 }
	 public TrigoAndCalculuPage clcikontrigoAndCalculuLink() {
		 driver.findElement(trigoAndCalculuLink).click();
		 return new TrigoAndCalculuPage();
	 }
	 public OtherStuffPage clickonotherStuffLink() {
		 driver.findElement(otherStuffLink).click();
		 return new OtherStuffPage();
	 
		 
	 }
		
	 
	 
	 
		 
	 
	 

	 }


