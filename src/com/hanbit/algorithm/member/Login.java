package com.hanbit.algorithm.member;
import java.util.Scanner;

public class Login {
		public static final String USER_ID="LeeSangYoon";
		public static final String USER_PW="1";
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("로그인\n");
		String result = "";
		System.out.print("아이디를 입력하세요.");
		String id = s.next();
		if (!id.equals(USER_ID)){
			result = ("아이디 땡!");
		}
		else {
			System.out.print("비밀번호를 입력하세요.");
			String pw = s.next();
			if (id.equals(USER_ID) && !pw.equals(USER_PW)) {
				result = ("비밀번호 땡!");
			}
			else {
				result = "로그인 대따 !";
		}

			
		}		
		System.out.print(result);
	}
}