package assignment;
//import java.util.*;
//import java.util.Scanner;

public class shuffling2Darray {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4, 5, 10, 7}, {2, 3, 4, 5, 6, 9, 8}};
        //Scanner input = new Scanner(System.in);

        System.out.println("Before Shuffling : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[i].length);
                int temp = matrix[i][j];

                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
        System.out.println(" ");
        System.out.println("After Shuffling  : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
