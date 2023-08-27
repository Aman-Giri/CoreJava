package Basics;

import java.util.Scanner;

public class IfelseConditions {
    
   public static void main(String[] args) {

    System.out.println("Enter the age: ");

     Scanner in = new Scanner(System.in);
     int age = in.nextInt();

     if(age>= 18){
        System.out.println("You are the adult");
     }else{
        System.out.println("you are not the adult person");
     }
   }

}
