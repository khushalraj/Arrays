package com.example.arrays;

import java.util.Iterator;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int arr[] = {1,2,12,0,30,4};
		
		int left = 0;
		int right = arr.length-1;
		
		while(left < right)
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		for(int num : arr)
		{
			System.out.println(num);
		}
	
		/*
		 * int a = 3; int b = 4;
		 * 
		 * int temp = a[i]; a[i] = b[i+1]; b = temp;
		 * 
		 * System.out.println("value of a" + a); System.out.println("value of b" + b);
		 */
		
	}
}
