package com.cenfotec.examen2.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import com.cenfotec.examen2.criba.CribaEratostenes;

public class UI {
	
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	
	static CribaEratostenes criba = new CribaEratostenes();

	public static void main(String[] args) throws NumberFormatException, IOException {
		int tope;
		out.println("Digite el numero tope para obtener los números primos");
		tope = Integer.parseInt(in.readLine());
		int[] aCriba = criba.generaCriba(tope);
		imprimirCriba(aCriba);
	}

	private static void imprimirCriba(int[] pACriba) {
		for(int i = 0; i < pACriba.length; i++) {
			out.println(pACriba[i]);
		}
	}

}
