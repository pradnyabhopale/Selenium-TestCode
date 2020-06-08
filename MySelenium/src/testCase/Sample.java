package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pradnya.bhopale\\Downloads\\pageObjectModel28112019-master\\pageObjectModel28112019-master\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		try {
			
			Thread.sleep(5000);
			}
			catch(Exception e) {
				// 
			}
		WebElement userNam = driver.findElement(By.xpath("//input[@name='userName']"));
		userNam.sendKeys("a");
		
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("a");
	
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@name='login']"));
		loginbutton.click();
		
		
//		WebElement monthdd = driver.findElement(By.xpath("//input[@name='fromMonth']"));
//	    Select monthd = new Select (monthdd);
//		monthd.
//		
		loginbutton.sendKeys(Keys.ENTER);
		loginbutton.sendKeys(Keys.CONTROL+""+"t"); //this is for single key
		
		try {
		
		Thread.sleep(5000);
		}
		catch(Exception e) {
			
		}
		
		//driver.quit();
	}
}

