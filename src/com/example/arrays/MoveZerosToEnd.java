package com.example.arrays;

public class MoveZerosToEnd {
public static void main(String[] args) {
	int arr[] = {0,0,0,1,2,12,0,30,4};
	int left = 0;
	int right = 0;
	     while(left < arr.length)
	     {
	    	 if(arr[left]!=0)
	    	 {
	    		 int temp = arr[right];
	    		 arr[right] = arr[left];
	    		 arr[left] = temp;
	    		 right++;
	    	 }
	    	 left++;
	     }
	     for(int num : arr)
	     {
	    	 System.out.println(num);
	     }
     }
}
