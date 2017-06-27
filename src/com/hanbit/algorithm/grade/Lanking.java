package com.hanbit.algorithm.grade;
import java.util.Scanner;


//가장 큰수부터 나열하기
public class Lanking {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] score = new int[3];
		int i=0;
		int num1 = 0, num2 = 0, num3 = 0;
		String[] names = new String[3];

		int[] scoreLank = new int[3];
		String[] nameLank = new String[3];
				
		for (; i<3; i++) {
			System.out.print("이름을 입력하세요.");
			names[i] = s.next();
			System.out.print("값을 입력하세요.");
			score[i] = s.nextInt();
		}
		
		if (score[0] > score[1] && score[0] > score[2]) {
			nameLank[0] = names[0];
			scoreLank[0] = score[0];
			
			if (score[1] > score[2]) {
				nameLank[1] = names[1];
				scoreLank[1] = score[1];
			}
			else {
				nameLank[1] = names[2];
				scoreLank[1] = score[2];
			}
		}
		else if (score[1] > score[0] && score[1] > score[2]) {
				nameLank[0] = names[1];
				scoreLank[0] = score[1];
			if (score[2] > score[0]) {
				nameLank[1] = names[2];
				scoreLank[1] = score[2];
			}
			else {
				nameLank[2] = names[0];
				scoreLank[2] = score[0];
			}
		}
		else {
			if (score[1] > score[0]) {
				nameLank[0] = names[2];
				scoreLank[0] = score[2];
			}
			else {
				nameLank[1] = names[0];
				scoreLank[1] = score[0];
			}
		}
		
			System.out.print(nameLank[0] + " : " + scoreLank[0] + "점 " + nameLank[1] + " : " + scoreLank[1] + "점 " + nameLank[2] + " : " + scoreLank[2] + "점");
	}
}
/*
1 2 3
1 3 2
2 3 1
2 1 3
3 1 2
3 2 1
*/