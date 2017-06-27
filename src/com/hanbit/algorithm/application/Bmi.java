package com.hanbit.algorithm.application;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		String result = "";
		
		System.out.print("BMI\n");
		Scanner m = new Scanner(System.in);

		System.out.print("height\n");
		double height = m.nextDouble();

		System.out.print("weight\n");
		double weight = m.nextDouble();

		double bmi = (weight/(height*height));
		
		System.out.print("### bmi 값 : " + bmi + "\n");
		
		if (bmi >= 30.0){
			result = "비만";
		}
		else if (bmi >= 25.0) {
			result = "과체중";
		}
		else if (bmi >= 18.5) {
			result = "정상";
		}
		else if (bmi <= 18.5) {
			result = "저체중";
		}
		System.out.print(result);
	}
}