package matrixproject;

import java.util.Scanner;

public class MatrixProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];

        // Input nilai matrix
        System.out.println("Masukkan elemen matrix 3x3:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Menampilkan matrix
        System.out.println("\nMatrix 3x3 yang dimasukkan:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}
