package Redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbuslogin {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/bus-tickets/chennai-to-coimbatore?fromCityName=Chennai&fromCityId=123&toCityName=Coimbatore&toCityId=141&onward=29-Feb-2024&busType=Any");
	driver.manage().window().maximize();
	String values=driver.findElement(By.xpath("//div[contains(text(),'23:05')]]/parent::div/child::div")).getText();
	System.out.println(values);

}

}