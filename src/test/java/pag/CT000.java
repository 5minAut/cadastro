package pag;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

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
			try {
				Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/h1/a")).getText(),titulo);
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,sucess,"CT00/aberturaBrowser.png");
			} catch (AssertionError e) {
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT00/aberturaBrowser.png");
				System.out.println(e.getMessage());
				fail();
			}			
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT00/aberturaBrowser.png");
			System.out.println(e.getMessage());
			fail();
		}
	}
}
