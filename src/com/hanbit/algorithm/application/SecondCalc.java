package com.hanbit.algorithm.application;
import java.util.Scanner;

public class SecondCalc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("초를 입력해주세요.");
		int sec = s.nextInt();
		
		int our = sec/3600;
		int min = sec%3600/60;
		int second = sec%3600%60;
		
		System.out.print(String.format("%d 시간 %d 분 %d 초 입니다.",our, min, second));
		
	}
}