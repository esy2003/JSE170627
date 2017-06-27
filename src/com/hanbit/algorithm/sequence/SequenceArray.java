package com.hanbit.algorithm.sequence;

public class SequenceArray {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i=0; i<10;i++) {
			arr[i] = (i+1);
		}
		int sum=0;

		for (int i=0;i<arr.length;i++) {
			System.out.println(i+1);
			sum += arr[i];
		}
		System.out.print("SUM : " + sum);
	}
}