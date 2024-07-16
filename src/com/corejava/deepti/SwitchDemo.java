package com.corejava.deepti;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		switch (number) {
		case 1: {
			System.out.println("You entered 1");
//			break;
		}
		case 2: {
			System.out.println("You entered 2");
			break;
		}
		default: {
			System.out.println("Wrong Input");
			break;
		}

		}
	}

}
