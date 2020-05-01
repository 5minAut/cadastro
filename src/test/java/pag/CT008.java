package pag;

import static org.junit.Assert.fail;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import config.Base;
import cucumber.api.java.pt.Dado;

public class CT008 extends Base {

	@Dado("^realizar a exclusão de um usuário$")
	public void realizarExclusaoUmUsuario() throws Throwable {
	    try {
	    	driver.findElement(By.xpath("(//a[contains(text(),'Deletar')])[1]")).click();	    	
	    	Alert alert = driver.switchTo().alert();
	    	alert.accept();
	    	img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,sucess,"CT08/ct08.png");
	    	Thread.sleep(2000);
	    }catch (Exception e) {
			System.out.println(e.getMessage());
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT08/ct08.png");
			btnLimpar();
			fail();
		}
	}

}
