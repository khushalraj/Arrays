package com.example.arrays;

public class TwoSum {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 4, 5 };
		int target = 40;

		for (int left = 0; left < arr.length; left++) {
			for (int right = left + 1; right < arr.length; right++) {
				if (arr[left] + arr[right] == target) {
					System.out.println("two sum " + left + "" + right);
					return;
				}

			}

		}
		System.out.println(" target not found ");
	}
}
