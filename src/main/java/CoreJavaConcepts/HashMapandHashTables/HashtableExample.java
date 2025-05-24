package CoreJavaConcepts.HashMapandHashTables;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
        hm.put(1, "Gartner");
        hm.put(2, "Genpact");
        hm.put(3, "Accenture");
        hm.put(4, "Cvent");
        System.out.println(hm.get(2));
        hm.remove(4);
        System.out.println(hm.get(4));

        //Hashtable - pass table set collections
        Set sn= hm.entrySet();
        Iterator it =sn.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("****************************");

        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() +" "+m.getValue());
        }

    

        

    }
}
