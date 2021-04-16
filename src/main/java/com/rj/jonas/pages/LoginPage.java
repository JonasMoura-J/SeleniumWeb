package com.rj.jonas.pages;

import org.openqa.selenium.By;

import com.rj.jonas.core.BasePage;
import com.rj.jonas.core.DriverFactory;

public class LoginPage extends BasePage {
	public void acessarTelaPrincipal() {
		DriverFactory.getDriver().get("http://srbarriga.herokuapp.com");
	}
	
	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setSenha(String senha) {
		escrever("senha", senha);
	}
	
	public void entrar() {
		clicarBotao(By.xpath("//button[.='Entrar']"));
	}
	
}
