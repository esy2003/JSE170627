package com.hanbit.algorithm.sequence;
public class EvenSum {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		
		for (int i=0;i<=10;i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.print(sum);
	}
}