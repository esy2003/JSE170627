package com.hanbit.algorithm.calculator;
import java.util.Scanner;

public class Divid {
	public static void main(String[] args) {
		System.out.print("나누기\n");
		Scanner d = new Scanner(System.in);

		System.out.print("첫번째 숫자 입력\n");
		int a = d.nextInt();

		System.out.print("두번째 숫자 입력\n");
		int b = d.nextInt();

		int c = a / b;
		System.out.print("결과:" + c);
	}
}