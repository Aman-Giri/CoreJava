package Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrix[1][0]);
        //printing all the elements of the multidimensional arrays

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(numbers[i][j]);
            }
        }
    }
}
