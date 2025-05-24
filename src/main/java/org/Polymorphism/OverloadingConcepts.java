package org.Polymorphism;

public class OverloadingConcepts {
    //function overloading : Class has more than one function with same name
//either argument count should be different or 
//argument data type should be different

public void getdata(String a){
    System.out.println("The String Value is: "+ a);
}

public void getdata(int b){
    System.out.println("The Integer Value is: "+ b);
}

public static void main(String[] args) {
    OverloadingConcepts obj = new OverloadingConcepts();
    obj.getdata("Aman and Mukul");
    obj.getdata(25);
}

}
