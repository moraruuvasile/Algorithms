
package com.example.lib;


public class My {
	public static void main(String[] args) {
		System.out.println(vasea(3, new int[]{1,2,5}));
	}

	public static int vasea(int numar, int[] monede){
		int[] optiuni = new int[numar + 1];
		optiuni[0] = 1;
		for(int i:monede){
			int j =0;
			while(j++ < optiuni.length){
				if(i <= j){
					optiuni[j]+= j-i;
					System.out.print(optiuni[j]);
				}
				System.out.println();
			}
		}
		return 7;
	}



}


