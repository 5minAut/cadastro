package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static int x=1;
	
	public void browserChrome() {		
		try {
			System.setProperty("file.encoding", "UTF-8");System.setProperty("file.encoding", "UTF-8");
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");			
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	protected void btnLimpar() throws InterruptedException {
		driver.findElement(By.linkText("Limpar")).click();
		Thread.sleep(2000);
	}
	
}
