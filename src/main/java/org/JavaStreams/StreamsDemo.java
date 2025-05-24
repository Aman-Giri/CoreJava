package org.JavaStreams;

import java.util.ArrayList;

public class StreamsDemo {
    
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Aman");
        names.add("Abhijeet");
        names.add("Karan");
        names.add("Sunny");
        names.add("Abhishek");

        //count the names starts with character A without using java Streams
        // int count = 0;
        // for(int i=0;i<names.size();i++){
        //    String actualname = names.get(i);
        //    if(actualname.startsWith("A")){
        //     count++;
        //    }
        // }
        // System.out.println("The count is: " + count);

        //count the names by using the concept of java streams 
       Long c =  names.stream().filter(s -> s.startsWith("A")).count();
       System.out.println("The count is: " + c);
    }
}
