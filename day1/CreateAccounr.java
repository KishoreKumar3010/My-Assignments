package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccounr {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Testleaf\\eclipse\\Selenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("test accounr3010207");
		driver.findElement(By.name("description")).sendKeys("Test");
		driver.findElement(By.name("numberEmployees")).sendKeys("3456321");
		driver.findElement(By.name("officeSiteName")).sendKeys("Testleaf");
		Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//driver.close();
		
		 //driver.manage().window().minimize();
		
		 
		

	}

}
