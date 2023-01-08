package stg;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Home_page {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver  ;
		
		driver = new EdgeDriver() ;
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("problem_user");	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");	
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		String myTitle = driver.getTitle();
		
		System.out.println(myTitle);	
	}
}