package pag;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.By;

import config.Base;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

public class CT006 extends Base {

	@Dado("^realizar a edição do campo \"([^\"]*)\"$")
	public void realizarEdicaoCampoEmail(String email) throws Throwable {
		try {
			driver.findElement(By.linkText("Editar")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("useremail")).clear();
			driver.findElement(By.id("useremail")).sendKeys(email);
			driver.findElement(By.id("submit")).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			btnLimpar();
			fail();
		}
	}

	@Então("^validar se a mensagem de alerta \"([^\"]*)\"$")
	public void validarMensagemAlertaEdicao(String msg) throws Throwable {
	try {
		Assert.assertEquals(driver.findElement(By.xpath("//div[2]/div")).getText(),msg);
		btnLimpar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			btnLimpar();
			fail();
		}
	}

}
