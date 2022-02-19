package com.company.java;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {

		char operator;
		Double first, second;
		boolean isOn = true;
		Calc c = new Calc();

		// create an object of Scanner class
		Scanner input = new Scanner(System.in);

		while (isOn) {

			// ask users to enter operator
			System.out.println(
					"Select the operation: \n" + "1 - Addition,\n" + "2 - Subtraction,\n" + "3 - Multiplication,\n"
							+ "4 - Division,\n" + "5 - Modulo,\n" + "6 - Power,\n" + "7 - Exit Calculator.");
			operator = input.next().charAt(0);

			if (operator == '7') {
				System.exit(operator);

			}

			// ask users to enter numbers
			System.out.println("Enter first number");
			first = input.nextDouble();

			System.out.println("Enter second number");
			second = input.nextDouble();

			switch (operator) {

			// performs addition between numbers
			case '1':
				System.out.println(first + " + " + second + " = " + c.addition(first, second));
				System.out.println("----------------");
				break;

			// performs subtraction between numbers
			case '2':
				System.out.println(first + " - " + second + " = " + c.subtraction(first, second));
				System.out.println("----------------");
				break;

			// performs multiplication between numbers
			case '3':
				System.out.println(first + " * " + second + " = " + c.multiplication(first, second));
				System.out.println("----------------");
				break;

			// performs division between numbers
			case '4':
				System.out.println(first + " / " + second + " = " + c.division(first, second));
				System.out.println("----------------");
				break;

			// performs module between numbers
			case '5':
				System.out.println(first + " % " + second + " = " + c.modulo(first, second));
				System.out.println("----------------");
				break;

			// performs power operation between numbers
			case '6':
				System.out.println(first + " ^ " + second + " = " + c.power(first, second));
				System.out.println("----------------");
				break;

			default:
				System.out.println("Invalid operator!");
				break;
			}

		}

		input.close();
	}

}
