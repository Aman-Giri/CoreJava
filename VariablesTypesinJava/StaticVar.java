package VariablesTypesinJava;

public class StaticVar {
    //Instance variable
    String name;
    String address;
    static String city ; // static variable: means the instance of this variable will share among all the object in the current class
    static  int i;

    //static block: We can define all the static variables inside the static block
    static {
        city = "New Delhi";
        i = 0;
    }

    StaticVar(String name, String street){ // local variables: variables inside the constructor or inside the function is called the local variable
        //assigning these local variable to the instance variable
        this.name = name;
        this.address = street;
        i++;
        System.out.println("The value of the i is: " + i);
       
    }

    public void getAddress(){
        System.out.println("The Address is: "+ address+" "+city
        );
    }

    public static void getCity(){
        System.out.println("The City is: " + city);
    }

    public static void main(String[] args) {
        StaticVar sv = new StaticVar("Bob", "Karol Bagh");
        StaticVar sv1 = new StaticVar("Ram", "Raja Garden");
        sv.getAddress();
        sv1.getAddress();
        StaticVar.getCity();
        //we can also assign value to the static variable at runtime in java
        //we call static variable in main method by using class name only
        //we call static Method in main method by using class name or directly by the name of static method
        StaticVar.i = 10;
        System.out.println("The value of the static variable i is: " + i);
        
        
    }
}
