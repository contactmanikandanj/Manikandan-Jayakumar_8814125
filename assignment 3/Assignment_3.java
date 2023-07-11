package assignments_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.Chrome.driver", "E:\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.findElement(By.className("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.className("email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[normalize-space()='Catalog']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[normalize-space()='Categories']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='SearchCategoryName']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#SearchCategoryName")).sendKeys("Desktops");
		Thread.sleep(3000);
		driver.findElement(By.id("search-categories")).click();
		WebElement productname = driver.findElement(By.xpath("//td[normalize-space()='Computers >> Desktops']"));
		assert productname.getText().equals("Computers >> Desktops");
		driver.quit();
	}

}
