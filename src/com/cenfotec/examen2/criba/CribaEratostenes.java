package com.cenfotec.examen2.criba;

public class CribaEratostenes {
	public static int[] generaCriba(int tope){
		
		if (tope >= 2){
			
			boolean[] primo = generaBoolPrimos(tope+1);
			
			int[] primos = generarPrimos(primo);
			
			return primos;
		} else {
			return new int[0];
		}
		
	}

	public static boolean[] generaBoolPrimos(int dim) {
		boolean[] primo = new boolean[dim];
		
		for (int i = 0; i < dim; i++){
			primo[i] = true;
		}
		
		primo[0] = primo[1] = false;
		
		for (int i = 2; i< Math.sqrt(dim) + 1; i++){
			if (primo[i]){
				for (int j = 2*i; j < dim; j+=i){
					primo[j] = false;
				}
			}
		}
		
		return primo;
	}
	
	public static int[] generarPrimos(boolean[] primo) {
		int cuenta = 0;
		
		for (int i = 0; i < primo.length; i++){
			if (primo[i])
				cuenta++;
		}
		
		int[] primos = new int[cuenta];
		
		for (int i = 0,j = 0; i < primo.length; i++){
			if (primo[i])
				primos[j++] = i;
		}
		return primos;
	}
	
}
