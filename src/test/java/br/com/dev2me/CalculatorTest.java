package br.com.dev2me;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void deveriaSomarDoisValoresPassados() {
		int valora = 2;
		int valorb =2;
		int soma  =0;
		
		Calculator calc = new CalculatorImpl();
		
		soma = calc.sum(valora, valorb);
		
		assertEquals(soma,4);
	}
	
	@Test
	public void deveriaSubstrairDoisValoresPassados() {
		int valora = 2;
		int valorb =2;
		int sub  =0;
		
		Calculator calc = new CalculatorImpl();
		
		sub = calc.subtraction(valora, valorb);
		
		assertEquals(sub,0);
	}
}
