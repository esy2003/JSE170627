package com.hanbit.algorithm.calculator;
import java.util.Scanner;

public class Multi {
	public static void main(String[] args) {
		System.out.print("곱하기\n");
		Scanner multy = new Scanner(System.in);

		System.out.print("첫번째 숫자 입력\n");
		int a = multy.nextInt();

		System.out.print("두번째 숫자 입력\n");
		int b = multy.nextInt();

		int c = a * b;
		System.out.print("결과:" + c);
	}
}