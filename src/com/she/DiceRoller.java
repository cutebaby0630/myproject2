package com.she;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
		System.out.println("請輸入1到6中一個數字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int a = Integer.parseInt(line);
		
		
		Random n = new Random();
		int c=1;
		while(c<=3) {
			
			System.out.print(n.nextInt(6)+1);
			int b = n.nextInt(6) + 1;
			c++;
			
		}
		
		
	
		
			}
	}


