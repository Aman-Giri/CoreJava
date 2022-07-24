package oopsByAK;

//Multilevel Inheritance in java : chain of inheritance

class Shape2{
	public void display() {
		System.out.println("i am displaying");
		
	}
}

class Triangle3 extends Shape2{
	public void func1() {
		System.out.println("I am a triangle");
	}
}

class Equilateral extends Triangle3{
	public void func2() {
		System.out.println("I am equilateral Triangle");
	}
}

public class MultiLevel_Inheritance {
	public static void main(String[] args) {
		Equilateral e1 = new Equilateral();
		e1.func1();
		e1.func2();
		e1.display();
	}
}
