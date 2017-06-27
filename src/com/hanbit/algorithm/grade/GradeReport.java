package com.hanbit.algorithm.grade;
import java.util.Scanner;

public class GradeReport {
	public static void main(String[] args) {

		//name, kor, eng, math
		//total, avg
		//홍길동 : B
		
		//definition
		Scanner s = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0, total = 0, avg = 0;
		String result = "";
		//input
		System.out.print("이름을 입력\n");
		String name = s.next();
		System.out.print("kor");
		kor = s.nextInt();
		System.out.print("eng");
		eng = s.nextInt();
		System.out.print("math");
		math = s.nextInt();
		//operation
		total = kor + eng + math;
		avg = total / 3;
		
		if (avg >=90){
			result = "A";
		}
		else if (avg >= 80) {
			result = "B";
		}
		else if (avg >= 70) {
			result = "C";
		}
		else if (avg >= 60) {
			result = "D";
		}
		else if (avg >= 59) {
			result = "E";
		}
		else {
			result = "낙제 이새끼야";
		}
		//output
		System.out.print(String.format
		("%s 님은 국어 %d 수학 %d 영어 %d 합 %d 평균 %d 점으로 %s 입니다\n"
		,name, kor, math, eng, total, avg, result));
				System.out.print(" 이름  총점  평균  등급\n" + "---------------------------\n" + " | " + name + "  |  " + total + " | " + avg + " | " + " | " +result + " |");
	}
}