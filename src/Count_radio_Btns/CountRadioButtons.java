package Count_radio_Btns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webflow.com/made-in-webflow/website/Fully-Custom-Radio-Buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Sharmila");
		
		WebElement mail = driver.findElement(By.name("email"));
		mail.sendKeys("abc@gamil.com");
			
		
			List<WebElement> radiobutns = driver.findElements(By.className("radio w-radio selected"));
			for(WebElement radiobtn:radiobutns)
			{
				System.out.println(radiobtn);
			}
		
		WebElement submit = driver.findElement(By.className("w-button"));
		submit.click();

	}



	}

