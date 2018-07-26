package com.cenfotec.examen2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.examen2.criba.CribaEratostenes;

public class CribaEratostenesTest {
	
	static CribaEratostenes criba = new CribaEratostenes();

	@Test
	public void generaCribaTest() {
		int[] aCriba = criba.generaCriba(10);
		assertEquals(2,aCriba[0]);
		assertEquals(3,aCriba[1]);
		assertEquals(5,aCriba[2]);
		assertEquals(7,aCriba[3]);
	}
	
	@Test
	public void generaBoolPrimosTest() {
		boolean[] bPrimos = criba.generaBoolPrimos(11);
		assertEquals(true,bPrimos[3]);
	}
	
	@Test
	public void generarPrimosTest() {
		boolean[] bPrimos = criba.generaBoolPrimos(11);
		int[] primos = criba.generarPrimos(bPrimos);
		assertEquals(4,primos.length);
	}

}
