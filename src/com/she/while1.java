package com.she;

import java.util.Scanner;

public class while1 {
//不管輸入多少都印出1 * 3 * 5 * 7 * 9 *
	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int a = Integer.parseInt(line);
		
		int n = 1;
		while(a>=n) {
			if(n%2==0) {
				System.out.print("*" +" ");
			}else {
				System.out.print(n + " ");
			}if(n>=10) {
				break;
			}
			n++;
			
		}
	}

}
