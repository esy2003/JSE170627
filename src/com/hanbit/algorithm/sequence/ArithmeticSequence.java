package com.hanbit.algorithm.sequence;
public class ArithmeticSequence {
	public static void main(String[] args) {
		
		
        for(int i=1; i<=9; i++) {
            for(int j=2; j<=5; j++) {
                System.out.print(String.format("%d * %d = %d \t", j, i, j*i));
            }
            System.out.println();
        }
 
        System.out.println();
 
		
        for(int i=1; i<=9; i++) {
            for(int j=6; j<=9; j++) {
                System.out.print(String.format("%d * %d = %d \t", j, i, j*i));
            }
            System.out.println();
        }
    }
}