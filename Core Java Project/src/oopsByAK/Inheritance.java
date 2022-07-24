package oopsByAK;

/*
 In java there are 4 types of Inheritance except multiple inheritance
 which we used to have in C++ but in in java to achieve the multiple
 inheritance we can use interfaces concept 
  
 */

class Shape{ // Base or parent class
	String color;
}

class Triangle extends Shape{ // subclass or child class
	
}

public class Inheritance {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.color = "red";
	}
}
