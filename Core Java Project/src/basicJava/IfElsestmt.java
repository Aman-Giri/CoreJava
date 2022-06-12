package basicJava;

public class IfElsestmt {
	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		//Comparison operator : 
		// < > <= >= == !=
		
		int c = 40;
		int d = 50;
		
		if(c == d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		//write a logic to find out the highest number : 
		int a1 = 400;
		int b1 = 200;
		int c1 = 200;
		
		if(a1>b1 && a1>c1) {
			System.out.println("a1 is greater");
		}else if(b1>c1) {
			System.out.println("b1 is greater");
		}else {
			System.out.println("c1 is greater");
		}
		
	}
	
	// & - bitwise operator , it deals with binary digits of the values
	// && - logical operator
}
