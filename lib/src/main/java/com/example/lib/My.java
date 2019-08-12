package com.example.lib;

public class My {
	public static void main(String[] args) {
		System.out.println(coinChange(12, new int[]{1,5,10}));
	}

	private static int coinChange(int numar, int[] monede){
		int[] optiuni = new int[numar + 1];
		optiuni[0] = 1;
		int suma;
		for(int monedaTip:monede){
			suma =0;
			while(suma++ < optiuni.length-1){
				if(monedaTip <= suma){
					optiuni[suma]+= optiuni[suma-monedaTip];
					printArray(optiuni);
				}
				System.out.println();
			}
		}
		return optiuni[numar];
	}

	private static void printArray(int[] valori){
		for(int i:valori) {
			System.out.print(i);
		}
	}



}


