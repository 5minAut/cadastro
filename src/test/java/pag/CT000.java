package pag;

import org.junit.Assert;
import org.openqa.selenium.By;

import config.Base;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

public class CT000 extends Base {

	@Dado("^a abertura do browser \"([^\"]*)\"$")
	public void acessoSistema(String url) throws Throwable {
		try {
			browserChrome();
			driver.get(url);
			Thread.sleep(2500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Então("^verificar se o sistema está disponível pela \"([^\"]*)\"$")
	public void verificarSistemaDisponivel(String titulo) throws Throwable {
		try {
			Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/h1/a")).getText(),titulo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
