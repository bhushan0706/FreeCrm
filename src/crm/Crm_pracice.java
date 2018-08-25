  package crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Crm_pracice {
 
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(5000);
		
		// to select the option from the drop down box
        WebElement edition = driver.findElement(By.id("payment_plan_id"));
        Thread.sleep(5000);
        Select select = new Select(edition);
        select.selectByValue("1");
        Thread.sleep(5000);
        driver.findElement(By.name("first_name")).sendKeys("Bhushan");
        
        driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Koli");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

}
