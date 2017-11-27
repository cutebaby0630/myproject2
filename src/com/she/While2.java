package com.she;

import java.util.Random;

public class While2 {

	public static void main(String[] args) {
		Random n1 = new Random();

		int n = 1;
		while (n <= 3) {
			System.out.print(n1.nextInt(10) + 1 + " ");
			n++;
		}
		
	}

}
