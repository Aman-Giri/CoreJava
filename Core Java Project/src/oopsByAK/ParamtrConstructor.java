package oopsByAK;

class Student2{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student2(String name,int age){ // Paramterised constructor
		this.name = name;
		this.age = age;
	}
}

public class ParamtrConstructor {
	public static void main(String[] args) {
		Student2 s1 = new Student2("Aman" , 23);
		s1.printInfo();
	
	}
}
