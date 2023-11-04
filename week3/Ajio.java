package week3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ajio {
       
	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver = new ChromeDriver();
		
	    FirefoxDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get( "https://www.ajio.com/");
		driver.findElement(By.tagName("input")).sendKeys("Bags", Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label[1]")).click();
		String ad = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(ad);
		
		List<WebElement> brandName = driver.findElements(By.xpath("//div[@class='brand']"));
		for (int i = 0; i < brandName.size(); i++) {
			String bn = brandName.get(i).getText();
			System.out.println(bn);
		}
	
		
	}

}
