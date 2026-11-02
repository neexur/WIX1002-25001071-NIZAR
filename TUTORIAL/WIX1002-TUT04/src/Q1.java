/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

import java.util.*

public class Q1 {
    public static void main(String[] args) {
        //a
        int n = 0;
        while (true) {
            n++;
            if (n*n*n > 2000) break;
        }
        System.out.println("a) " + (n-1));
        
        //b
        System.out.println("b) ");
        for (int i=1; i<=12; i++) {
            System.out.println(i + " squared = " + i*i);
        }
        
        //c
        System.out.println("c) ");
        for (int i=0; i<=4; i++) {
            for (int j=0; j<=5; j++) {
                
            }
        }
        
        //d 
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for (int i=1; i<=num; i++) {
            sum += num;
        }
    }
}
