package oopsByAK;

//POLYMORPHISM
//Function Overloading : Compile time polymorphism
//We can achieve function overloading in java by two steps : 
//1.By changing number of arguments.
//2.By changing the data type.

class Student5{
	String name;
	int age;
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(name);
	}
	public void printInfo(String name , int age) {
		System.out.println(name + " " + age);
	}
}

public class Function_Overloading {
	public static void main(String[] args) {
		Student5 s1 = new Student5();
		s1.name = "Aman Giri";
		s1.age = 24;
		
		s1.printInfo(s1.name);
		s1.printInfo(s1.name, s1.age);
	}
}
