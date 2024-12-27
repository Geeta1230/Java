//public class arraymulti1 {
//    public static void main(String[] args) {
//        int[][] matrix= {
//                {1,2,3}, {4,5,6}, {7,8,9}
//        };
//        System.out.println("Elements of the 2D array:");
//        for (int i=0; i<matrix.length; i++){
//            for (int j=0; j<matrix.length; j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//array sum
//import java.util.*;
//
//public class arraymulti1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the number of rows and columns:");
//        int row = sc.nextInt();  // Example: 3
//        int col = sc.nextInt();  // Example: 3
//
//        int[][] M1 = new int[row][col];
//        int[][] M2 = new int[row][col];
//        int[][] M3 = new int[row][col];  // To store the result of addition
//
//        System.out.println("Enter the elements of 1st matrix:");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                M1[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Enter the elements of 2nd matrix:");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                M2[i][j] = sc.nextInt();
//            }
//        }
//
//        // Adding the two matrices
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                M3[i][j] = M1[i][j] + M2[i][j];
//            }
//        }
//
//        System.out.println("Resultant matrix after addition:");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(M3[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        sc.close();
//    }
//}

import java.util.*;

public class arraymulti1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the first matrix:");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        System.out.println("Enter the number of rows and columns for the second matrix:");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();



        int[][] M1 = new int[row1][col1];
        int[][] M2 = new int[row2][col2];
        int[][] M3 = new int[row1][col2];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                M1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                M2[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    M3[i][j] += M1[i][k] * M2[k][j];
                }
            }
        }


        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(M3[i][j] + " ");
            }
            System.out.println();
        }


    }
}