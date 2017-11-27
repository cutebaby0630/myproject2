package com.she;

import java.util.Random;
import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		int n =10;
		System.out.print("請輸入星期:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		n = Integer.parseInt(line);
		switch (n) {
		case 1:
			System.out.println("W1");
			break;
		case 2:
			System.out.println("W2");
			break;
		case 3:
			System.out.println("W3");
			break;
		case 4:
			System.out.println("W4");
			break;
		case 5:
			System.out.println("W5");
			break;
		case 6:
			System.out.println("W6");
			break;
		case 7:
			System.out.println("W7");
			break;
		default:
			System.out.println("There is only seven days in a week");
		}
	}
}
