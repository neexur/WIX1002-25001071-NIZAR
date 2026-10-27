/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter value of a:");
        int a = in.nextInt();
        System.out.println("Enter value of b:");
        int b = in.nextInt();
        System.out.println("Enter value of c:");
        int c = in.nextInt();
        System.out.println("Enter value of d:");
        int d = in.nextInt();
        System.out.println("Enter value of e:");
        int e = in.nextInt();
        System.out.println("Enter value of f:");
        int f = in.nextInt();
        
        in.close();
        
        double deno = a*d-b*c;
        
        if (deno == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e*d-b*f)/deno;            
            double y = (a*f-e*c)/deno;

            System.out.printf("x is %.2f%n", x);            
            System.out.printf("y is %.2f%n", y);
        }
    }
}
