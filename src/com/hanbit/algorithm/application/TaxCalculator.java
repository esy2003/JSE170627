package com.hanbit.algorithm.application;
/*
이름,연봉 입력받아
연봉 ***만원 받는 xx너는 세금을 ??만원 내라
*/
import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double rate = 0;
		
		System.out.print("이름\n");
		String name = s.next();
		System.out.print("연봉\n");
		int inCome = s.nextInt();

		if (inCome <= 1200){
			rate = 0.08;
		}
		else if (inCome > 1200 && 4600 >= inCome) {
			rate = 0.17;
		}
		else if (inCome > 4600 && 8800 >= inCome) {
			rate = 0.26;
		}
		else {
			rate = 0.35;
		}
		int tax = (int)(inCome * rate);


		System.out.println("********************************");
		System.out.println("이름 | 연봉 | 세율 | 납부할 세금");
		System.out.println("--------------------------------");
		System.out.println( name + " | " + inCome + "만원" + " | " + (int)(rate*100) + " | " + tax + "만원");
		System.out.print("********************************\n");
		//System.out.print(String.format("연봉 %d 만원을 받으시는 %s 님은 세금을 %d 만원 내세요", inCome, name, tax));
	}
}