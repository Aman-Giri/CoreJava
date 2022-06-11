package basicJava;

public class StringConcatenation {
	public static void main(String[] args) {
		//+ is the concatenation operator : 
		//Same operation we can also perform by using the double data types
		//print : is used to print on the console
		//println : is used to print on the console with a new line
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "world";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.print(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		
	}
}
