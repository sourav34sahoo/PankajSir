package com.interfaceConcept;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("eating");
	}

	@Override
	public void noise() {
		System.out.println("Bow bow...");
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.noise();
	}
	

}
