package ArraylistandSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
  
    public static void main(String[] args) {
          //Hashset, treeset, linkedHashset implements Set interface
    //does not accept duplicate values
    //there is no gaurantee elements stored in sequential order or not. Random order is preferable here in the set

    HashSet<String> hs = new HashSet<String>();
    hs.add("India");
    hs.add("UK");
    hs.add("USA");
    hs.add("India");
    System.out.println(hs);
    System.out.println(hs.remove("UK"));
    System.out.println(hs.isEmpty());
    System.out.println(hs.size());
    hs.add("Pune");
    hs.add("Gurugram");
    hs.add("Bangalore");
    hs.add("Hyderabad");

    System.out.println("*********Iterator Concepts*****************");
    

    //Concept of Iterator
    Iterator<String> i =  hs.iterator();
    while (i.hasNext()) {
        System.out.println(i.next());
    }

    } 

}
