package pag;

import org.junit.Assert;
import org.openqa.selenium.By;

import config.Base;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class CT001 extends Base{

	@Dado("^o click no botão Add usuários;$")
	public void clickBnt() throws Throwable {
		try {
			driver.findElement(By.linkText("Add Usuários")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@E("^preencher todos os campos: \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\";$")
	public void preencherTodosCampos(String nome, String email, String telefone) throws Throwable {
		try {
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys(nome);
			
			driver.findElement(By.id("useremail")).clear();
		    driver.findElement(By.id("useremail")).sendKeys(email);
		    
		    driver.findElement(By.id("userphone")).clear();
		    driver.findElement(By.id("userphone")).sendKeys(telefone);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@E("^clicar no botão Adicionar;$")
	public void clicarBtnAdicionar() throws Throwable {
		try {
			driver.findElement(By.id("submit")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Então("^realizar busca pelos valores: (\\d+) \"([^\"]*)\";$")
	public void verificarUsuarioCadastrado(int id, String valor) throws Throwable {
		try {
			
			switch(id)
			{
				case 1:
					driver.findElement(By.id("userphone")).sendKeys(valor);
					driver.findElement(By.id("submit")).click();
					Thread.sleep(2000);
					Assert.assertEquals(driver.findElement(By.xpath("//td[4]")).getText(),valor);
					break;
				case 2:
					driver.findElement(By.id("username")).sendKeys(valor);
					driver.findElement(By.id("submit")).click();
					Thread.sleep(2000);
					Assert.assertEquals(driver.findElement(By.xpath("//td[2]")).getText(),valor);
					break;
				case 3:
					driver.findElement(By.id("useremail")).sendKeys(valor);
					driver.findElement(By.id("submit")).click();
					Thread.sleep(2000);
					Assert.assertEquals(driver.findElement(By.xpath("//td[3]")).getText(),valor);
					break;	
					
			}	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
