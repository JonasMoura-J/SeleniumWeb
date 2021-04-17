package com.rj.jonas.suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.rj.jonas.core.DriverFactory;
import com.rj.jonas.pages.LoginPage;
import com.rj.jonas.tests.ContaTest;
import com.rj.jonas.tests.MovimentacaoTest;
import com.rj.jonas.tests.RemoverMovimentacaoContaTest;
import com.rj.jonas.tests.ResumoTest;
import com.rj.jonas.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void inicializa(){
		page.acessarTelaInicial();
		
		page.setEmail("wagner@costa");
		page.setSenha("123456");
		page.entrar();
	}
	
	@AfterClass
	public static void finaliza(){
		DriverFactory.killDriver();
	}
}