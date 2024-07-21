package PracticePAckage;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        //for taking input use scanner class
        // className nameofobj = new classNAme();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the age: ");
        int age = sc.nextInt();
        
        if(age >= 18){
            System.out.println("Eligible for the vote");
        }else{
            System.out.println("Not eligible");
        }
    }
}
