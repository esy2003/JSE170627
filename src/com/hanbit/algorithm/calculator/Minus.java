package com.hanbit.algorithm.calculator;
import java.util.Scanner;

public class Minus {
	public static void main(String[] args) {
		System.out.print("마이너스\n");
		Scanner m = new Scanner(System.in);

		System.out.print("첫번째 숫자 입력\n");
		int a = m.nextInt();

		System.out.print("두번째 숫자 입력\n");
		int b = m.nextInt();

		int c = a - b;
		System.out.print("결과:" + c);
	}
}