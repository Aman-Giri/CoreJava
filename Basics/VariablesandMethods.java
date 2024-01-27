package Basics;

public class VariablesandMethods {
   
     static int a = 12;
     static String name = "Aman";

     //Lets Create the Method
     public void getdata(){
        System.out.println("I am in the method");
     }
    
    public static void main(String[] args) {

        System.out.println("Hi my name is Aman");
        System.out.println(a);
        System.out.println(name);
        
       VariablesandMethods obj = new VariablesandMethods();
      obj.getdata();
      //  VariablesandMethods.getdata();
    }
}
