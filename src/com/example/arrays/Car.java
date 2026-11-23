package com.example.arrays;

public class Car {
	String name;
	int price;
	String color;

	Car() {

	}

	Car(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", color=" + color + "]";
	}

}
