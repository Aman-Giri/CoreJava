package oopsByAK;

/*
 Hierarchical Inheritance : .
 When two or more classes inherits a single class
 */

class Animal {
	public void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal{
	public void meow() {
		System.out.println("meowing...");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.meow();
		//c.bark(); // Gives compile time error
	}
}
