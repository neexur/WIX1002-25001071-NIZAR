/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num1=0, num2=0, num3=0;
        for (int i=0; i<3; i++) {
            int j = i+1;
            System.out.println("Enter num" + j);
            switch (i) {
                case 0:
                    num1 = in.nextInt();
                    break;
                case 1: 
                    num2 = in.nextInt();
                    break;
                case 2:
                    num3 = in.nextInt();
                    break;
            }
        }
        
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("num1 is the biggest");
            } else {
                System.out.println("num3 is the biggest");
            }
        } else {
            if (num2 > num3) {
                System.out.println("num2 is the biggest");
            } else {
                System.out.println("num3 is the biggest");
            }
        }
    }
}
