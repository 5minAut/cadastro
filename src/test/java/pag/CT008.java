package pag;

import static org.junit.Assert.fail;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import config.Base;
import cucumber.api.java.pt.Dado;

public class CT008 extends Base {

	@Dado("^realizar a exclusão de um usuário$")
	public void realizarExclusaoUmUsuario() throws Throwable {
	    try {
	    	driver.findElement(By.xpath("(//a[contains(text(),'Deletar')])[1]")).click();
	    	Thread.sleep(2000);
	    	Alert alert = driver.switchTo().alert();
	    	alert.accept();
	    	Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			btnLimpar();
			fail();
		}
	}

}
