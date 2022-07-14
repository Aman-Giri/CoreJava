package oopsByAK;

class Pen {
	String color;
	String type;
	
	public void write() {
		System.out.println("write something");
		
	}
	
	public void printColor() {
		System.out.println(this.color); 
		// this keyword will tell that in a method the attribute is called by which object
	}
}


public class Oops {
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "gel";
		
		pen1.write();
		
		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.type = "ballpoint";
		
		pen1.printColor();
		pen2.printColor();
		
		
	}
}
