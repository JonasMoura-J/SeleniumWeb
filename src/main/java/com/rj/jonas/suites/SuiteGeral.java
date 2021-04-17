package com.rj.jonas.suites;

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
	private static LoginPage login = new LoginPage();
	
	@BeforeClass
	public static void reset() {
		login.acessarTelaInicial();
		login.setEmail("wagner@costa");
		login.setSenha("123456");
		login.entrar();
		
		login.clicarLink("reset");
		
		DriverFactory.killDriver();
	}
}