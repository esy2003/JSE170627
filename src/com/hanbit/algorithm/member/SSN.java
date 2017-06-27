package com.hanbit.algorithm.member;
import java.util.Scanner;

public class SSN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = s.next();
		System.out.println("주민번호를 입력하세요.");
		String ssn = s.next();
		
		String sYear = ssn.substring(0,2);
		int year = Integer.parseInt(sYear);
		
		
		/*
		if (gap >= 0) {
			age = 2017-(year + 2000) + 1;
		}
		else {
			age = 2017-(year + 1900) + 1;
		}
		*/
		
		//참이면 : 앞의 결과, 거짓이면 : 뒤의 결과
		
		char ch = ssn.charAt(7);
		String gender = "";
		
		switch (ch) {
			case '1' : case '3' : 
				gender = "남자";
				break;
			case '2' : case '4' :
				gender = "여자";
				break;
			case '5' : 
				gender = "외국인 남자";
				break;
			case '6' :
				gender = "외국인 여자";
				break;
			default :
				gender = "잘못된 값";
				break;
		}

		System.out.print("*******************\n");
		System.out.print(" 이름  나이  성별 \n");
		System.out.print("-------------------\n");
		System.out.print(String.format(" %s   %d   %s\n", name, (17-year>=0) ? 2017-(year + 2000) + 1 : 2017-(year + 1900) + 1, gender));
		System.out.print("*******************");
	}
}