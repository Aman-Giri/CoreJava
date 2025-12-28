package org.Loops;

public class ForEachLoop {
    public static void main(String[] args){
        int[] numbers = {23,45,33,28};
        int[][] matrix = {
                {23,54,33},
                {12,33,45},
                {43,54,90}
        };

        //applying for each loop for the 1d Array
        for(int num : numbers){
            System.out.println(num);
        }

        System.out.println("**********************");

        //applying for loop for the 2d Array
        for(int[] row : matrix){
            for(int element : row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
