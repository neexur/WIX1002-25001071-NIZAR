/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int input = 0,
            score = 0;
        
        do {
            System.out.println("Enter negative number to quit.");
            int m = r.nextInt(13);
            int n = r.nextInt(13);
            System.out.print(m + " x " + n + " = ");
            input = in.nextInt();
            
            if (check(m, n, input)) score++;
        } while (input >- 0);
        
        System.out.println("Your score is: " + score);
    }
    
    static boolean check(int a, int b, int c) {
        return a*b == c;
    }
}
