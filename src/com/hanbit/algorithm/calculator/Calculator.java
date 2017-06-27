package com.hanbit.algorithm.calculator;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		int result = 0;

		System.out.print("Enter integer\n");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		System.out.print("Enter integer\n");
		int b = s.nextInt();
		
		System.out.print("Enter opcode / 1. +, 2. -, 3. *, 4. /");
		int opcode = s.nextInt();

		if (opcode == 1) {
			result = a + b;
		}
		else if (opcode == 2) {
			result = a - b;
		}

		else if (opcode == 3) {
			result = a * b;
		}

		else {result = a / b;}

		System.out.print("result : " + result);

	}
}