/**
 * 
 */
package com.corejava.deepti;

import java.util.Scanner;

/**
 * 
 */
public class IfElseLadderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Percentage");
		int number = scanner.nextInt();
//		String name = scanner.nextLine();
//		float floatnumber = scanner.nextFloat();
//		double doubleNumber = scanner.nextDouble();
//		boolean booleanExp = scanner.nextBoolean();
//		long longNumber = scanner.nextLong();
		if (number >= 75) {
			System.out.println("You Scored Distinction " + number);
			if (number == 80) {
				System.out.println("You are promoted A Group");
			} else {
				System.out.println("You are promoted B Group");
			}
			System.out.println("Enter Student  Name");
			String name = scanner.next();
			System.out.println("Congratulations !! " + name);
		} else if (number >= 60) {
			System.out.println("You Scored First Class " + number);
		} else if (number >= 50) {
			System.out.println("You Scored Second Class " + number);
		} else if (number >= 40) {
			System.out.println("You Scored Pass Class " + number);
		} else {
			System.out.println("Fail");
		}

	}

}
