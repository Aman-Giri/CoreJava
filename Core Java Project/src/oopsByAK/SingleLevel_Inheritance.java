package oopsByAK;

//Single level Inheritance

class Shape1{
	public void area() {
		System.out.println("Display area");
	}
}

class Triangle1 extends Shape1{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
	}
}

public class SingleLevel_Inheritance {
	public static void main(String[] args) {
		Triangle1 t2 = new Triangle1();
		t2.area(3,6);
		t2.area();
	}
}
