package PracticePAckage;

public class Strings {
    public static void main(String[] args) {
        //by using literals - whenever we assign values directly to any variable
        String str1 = "Hello world";
        String str2 = "Hello world";

        System.out.println(str1 == str2); // true 

        //by using objects
        String str3 = new String("Hello world");
        String str4 = new String("Hello world");

        System.out.println(str3 == str4); // comparison on the basis heap memory

        System.out.println(str3.equals(str4)); //true



    }
}
