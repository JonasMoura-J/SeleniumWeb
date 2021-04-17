package com.rj.jonas.tests;

import org.junit.Assert;
import org.junit.Test;

import com.rj.jonas.core.BaseTest;
import com.rj.jonas.core.Propriedades;
import com.rj.jonas.pages.ContasPage;
import com.rj.jonas.pages.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void testExcluirContaComMovimentacao(){
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}
}

