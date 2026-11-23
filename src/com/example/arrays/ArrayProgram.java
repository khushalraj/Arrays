package com.example.arrays;

public class ArrayProgram {
public static void main(String[] args) {
	Car[] c = new Car[10];
	Car c0 = new Car("Maruti",12345,"White");
	Car c1 = new Car();	
	Car c2 = new Car("Maruti",12345,"Black");
	Car c3 = new Car();
	c[0] = c0;
	c[1] = c1;
	c[2] = c2;
	System.out.println(c[0]);
	System.out.println(c[1]);
	System.out.println(c[2]);
	
	
}
}
