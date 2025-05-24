package CoreJavaConcepts.Basics;

public class StringConcepts {
    public static void main(String[] args) {
         // Using string literal
         String literalString1 = "Hello, World!";
         String literalString2 = "Hello, World!"; // Reuses the same object
 
         System.out.println(literalString1 == literalString2); // true
 
         // Using string object
         String objectString1 = new String("Hello, World!");
         String objectString2 = new String("Hello, World!"); // Creates a new object
 
         System.out.println(objectString1 == objectString2); // false
 
         // Comparing content
         System.out.println(literalString1.equals(literalString2)); // true
         System.out.println(objectString1.equals(objectString2));   // true

         
    }
    
}
