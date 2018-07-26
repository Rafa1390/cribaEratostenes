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

}
