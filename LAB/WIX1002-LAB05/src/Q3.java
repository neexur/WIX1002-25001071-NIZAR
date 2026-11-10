/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of employee: ");
        int N = in.nextInt();
        
        int[][] hoursTable = new int[N][7];
        
        for(int i = 0; i<N; i++) {
            for (int j = 0; j < 7; j++) {
                int h = r.nextInt(8)+1;
                hoursTable[i][j] = h;
            }
        }
        
        System.out.print("EMPLOYEE S M T W T F S | TOTAL\n");
        
        for(int i = 0; i<N; i++) {
            int total = 0;
            System.out.printf("%-9d", i+1);
            for (int j = 0; j < 7; j++) {
                System.out.print(hoursTable[i][j] + " ");
                total += hoursTable[i][j];
            }
            System.out.print("|");
            System.out.printf("%6d", total);
            System.out.println();
        }
    }
}
