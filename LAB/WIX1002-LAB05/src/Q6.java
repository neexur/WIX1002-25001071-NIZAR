/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int N = in.nextInt();
        
        int[][] matrix = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == 0) matrix[i][j] = 1;
                else if (i == 0) matrix[i][j] = 0;
                else matrix[i][j] = matrix[i-1][j] + matrix[i-1][j-1];
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) System.out.printf("%4d", matrix[i][j]);
            System.out.println();
        }
    }
}
