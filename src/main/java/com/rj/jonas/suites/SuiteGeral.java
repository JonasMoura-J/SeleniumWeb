package com.rj.jonas.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

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
	
}