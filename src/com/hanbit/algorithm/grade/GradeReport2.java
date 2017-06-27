package com.hanbit.algorithm.grade;
import java.util.Scanner;

public class GradeReport2 {
	public static void main(String[] args) {

		//name, kor, eng, math
		//total, avg
		//홍길동 : B
		
		//definition
		Scanner s = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0, total = 0, avg = 0, score = 0;
		String result = "", grade = "";
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
			grade = "A";
		}
		else if (avg >=80){
			grade = "B";
		}
		else if (avg >=70){
			grade = "C";
		}
		else if (avg >=60){
			grade = "D";
		}
		else if (avg >=50){
			grade = "E";
		}
		else {
			grade = "낙제";
		}
		
		switch(score/10){
			case 10 : case 9 :
				grade = "A";
				result = "장학금500만원";
				break;
			case 8 :	
				grade = "B";
				result = "장학금400만원";
				break;
			case 7 :
				grade = "C";
				result = "장학금300만원";
				break;
			case 6 :
				grade = "D";
				result = "장학금200만원";
				break;
			case 5 :
				grade = "E";
				result = "장학금100만원";
				break;
			default : 
				result = "학사경고";
				break;
		}
		//output
		System.out.print(String.format
		("%s 님은 국어 %d 수학 %d 영어 %d 합 %d 평균 %d 점으로 %s 입니다\n"
		,name, kor, math, eng, total, avg, grade));
				System.out.print(" 이름  총점  평균  등급\n" + "---------------------------\n" + " | " + name + "  |  " + total + " | " + avg + " | " + " | " +grade + " |");
	}
}