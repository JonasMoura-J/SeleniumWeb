package com.rj.jonas.tests;

import org.junit.Assert;
import org.junit.Test;

import com.rj.jonas.core.BaseTest;
import com.rj.jonas.core.Propriedades;
import com.rj.jonas.pages.HomePage;
import com.rj.jonas.pages.MenuPage;

public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();

	@Test
	public void testSaldoConta(){
		menu.acessarTelaPrincipal();
		Assert.assertEquals("500.00", page.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
	}
}