package org.HashMapandHashTables;

import java.util.ArrayList;

public class QuestionsExample {
    public static void main(String[] args) {
        int a[] ={ 4,5,5,5,4,6,6,9,4};
        // Print unique number from the above array
        ArrayList<Integer> ab = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            int k=0;
            if(!ab.contains(a[i])){
                ab.add(a[i]);
                k++;

                for(int j=i+1;j<a.length;j++){
                    if(a[i] == a[j]){
                        k++;
                    }
                }
                // System.out.println(a[i]);
                // System.out.println(k);
                if(k==1){
                    System.out.println(a[i] + " is the unique number");
                }
            }
        }
    }
}
