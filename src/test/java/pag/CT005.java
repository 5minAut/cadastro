package pag;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import config.Base;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

public class CT005 extends Base {

	@Dado("^a busca pelos campos: \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\";$")
	public void PreencherTodosCampos(String nome, String email, String telefone) throws Throwable {
		try {
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys(nome);
			
			driver.findElement(By.id("useremail")).clear();
		    driver.findElement(By.id("useremail")).sendKeys(email);
		    
		    driver.findElement(By.id("userphone")).clear();
		    driver.findElement(By.id("userphone")).sendKeys(telefone);
		    
		    driver.findElement(By.id("submit")).click();
		    
		    Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			btnLimpar();
			fail();
		}
	}

	@Então("^realizar busca pelos valores: \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\";$")
	public void RetornoValores(String nome, String email, String telefone) throws Throwable {
		try {
			
			try {
				Assert.assertEquals(driver.findElement(By.xpath("//td[2]")).getText(),nome);
				Assert.assertEquals(driver.findElement(By.xpath("//td[3]")).getText(),email);
				Assert.assertEquals(driver.findElement(By.xpath("//td[4]")).getText(),telefone);	
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,sucess,"CT005/ct005.png");
			} catch (AssertionError e) {
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT005/ct005.png");
				System.out.println(e.getMessage());
				btnLimpar();
				fail();
			}
			
			btnLimpar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT005/ct005.png");
			btnLimpar();
			fail();
		}
	}

}
