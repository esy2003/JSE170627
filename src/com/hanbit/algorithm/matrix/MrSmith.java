package com.hanbit.algorithm.matrix;
public class MrSmith {
	public static void main(String[] args) {
		//int [][] mtx = new int[4][5]; 하면 행(좌우길이) 5, 열(세로높이) 4의 20개의공간을가진 틀이생김
		String[][] mtx={
			{"Good morning", "Good Afternoon", "Good Evening", "Good Bye"},
			{"Mr.", "Mrs.", "Miss", "My"},
			{"Smith", "Alex", "John", "James"}
		};
		
		
		System.out.print(mtx[0][3] + "\t" + mtx[1][3] + "\t" + mtx[2][3]);
	}
}