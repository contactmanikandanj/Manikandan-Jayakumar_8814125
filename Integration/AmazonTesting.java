package Lab_5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Chrome.driver", "E:\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop"+Keys.RETURN);
		Thread.sleep(5000);
		driver.findElement(By.className("s-image")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		WebElement cart_count = driver.findElement(By.id("nav-cart-count-container"));
		assert cart_count.getText().equals("1");
		cart_count.click();
		driver.quit();
	}

}