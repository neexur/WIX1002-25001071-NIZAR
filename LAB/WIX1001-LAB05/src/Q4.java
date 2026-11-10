/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */
public class Q4 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,5,7},
            {3,6,9},
            {5,3,8}
        };
        
        int[][] rmatrix = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rmatrix[2-j][i] = matrix[i][j];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rmatrix[i][j]);
            }
            System.out.println();
        }
    }
}
