package Loops;

public class DoWhileLoop {
    public static void main(String[] args) {
       int i=1;
       do{
        System.out.println(i); // This loop will always execute one time even if the condition is wrong also
        i++;
       }while(i<0);
    }
}
