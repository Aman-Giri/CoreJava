package org.ArraylistandSet;

import java.util.ArrayList;

public class ArraylistExample {
    // can accept duplicate values
    //ArrayList,LinkedList,vector- Implementing List interface
    //array have fixed size where as arraylist can grow dynamically
    //you can access and insert any value in any index

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Aman");
        a.add("Java");
        a.add("Python");
        System.out.println(a);
        a.add(0,"Karan");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        System.out.println(a.get(1));
        System.out.println(a.contains("Python"));
        System.out.println(a.indexOf("Aman"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        
    }

}
