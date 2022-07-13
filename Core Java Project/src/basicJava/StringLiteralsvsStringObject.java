package basicJava;

public class StringLiteralsvsStringObject {
	public static void main(String[] args) {
		String str1 = "Aman"; //String Literal
		String str2 = new String("Aman"); // String Object
		String str3 = "Aman";
		
		System.out.println(str1 == str3);
		System.out.println(str1==str2); // false
		System.out.println(str1.equals(str2)); // true
		
		//by new keyword we are providing the space/location into the heap memory
		
		
	}
}
