package pag;

import org.openqa.selenium.By;

import config.Base;
import cucumber.api.java.pt.Dado;

public class CT002 extends Base {

	@Dado("^a busca pelo campo \"([^\"]*)\"$")
	public void buscaNome(String valor) throws Throwable {}
}
