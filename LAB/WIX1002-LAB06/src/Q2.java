/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */
public class Q2 {
    public static void main(String[] args) {
        int row = 5;
        char ch = 'B';
        
        // display triangle
        for (int i = 0; i < row; i++) {
            multiPrint(i+1, ch);
            System.out.println();
        }
        
        // display diamond
        for (int i = 1; i <= row; i++) {
            multiPrint(row - i, ' ');
            multiPrint(2 * i, ch);
            System.out.println();
        }
        for (int i = row; i > 0; i--) {
            multiPrint(row - i, ' ');
            multiPrint(2 * i, ch);
            System.out.println();
        }
    }
    
    static void multiPrint(int n, char c) {
        for (int i=0; i<n; i++) System.out.print(c);
    }
}
