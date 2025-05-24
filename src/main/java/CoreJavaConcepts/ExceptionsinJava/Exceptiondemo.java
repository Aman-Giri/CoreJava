package CoreJavaConcepts.ExceptionsinJava;

public class Exceptiondemo {
    //One try can be followed by multiple catch blocks
    //catch should be an immediate block after try
    //
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = 0;
         //Try Catch Mechanism
    try{
        int k = b/c;
        System.out.println("The value of the K is: " + k);
        // int arr[] = new int[3];
        // System.out.println("The value of the array at 4th index is " + arr[4]);
        
    }
    catch(ArithmeticException ae){
        System.out.println("I catch the arithmetic exception");
    }
    catch(IndexOutOfBoundsException ib){
        System.out.println("I catched the index out of bound exception");
    }
    catch(Exception e){ // It accept all kind of exception this is the generic one
        System.out.println("I catched the error exception");
    }
    finally{
        // this block is executed irrespective of exception thrown or not
         System.out.println("Delete cookies");
    }
    }
    
}
