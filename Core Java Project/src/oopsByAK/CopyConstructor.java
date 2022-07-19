package oopsByAK;

//Copy constructor copies one object and then put it into the another object

class Student3{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student3(Student3 s2){ //copy Constructor
		this.name = s2.name;
		this.age = s2.age;
	}
	
	Student3(){
		
	}
}

public class CopyConstructor {
	public static void main(String[] args) {
		Student3 s1 = new Student3();
		s1.name = "Aman";
		s1.age = 24;
		
		Student3 s2 = new Student3(s1);
		s2.printInfo();
	}
}
