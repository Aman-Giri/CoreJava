package oopsByAK;

//Non parameterised constructor in Java
 
class Student1 {
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student1(){
		System.out.println("Constructor is called");
	}
}

 

public class ConstructorinJava {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.name = "aman";
		s1.age = 24;
		
		s1.printInfo();
	}
}
