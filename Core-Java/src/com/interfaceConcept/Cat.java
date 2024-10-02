package com.interfaceConcept;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("eating");
	}

	@Override
	public void noise() {
		System.out.println("Mew mew...");
	}
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.noise();
	}

}
