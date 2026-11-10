/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int N = in.nextInt();
        Random r = new Random();
        int[] scores = new int[N];
        int min = Integer.MAX_VALUE;
        int max = -Integer.MAX_VALUE;
        int sum = 0;
        
        for(int i = 0; i<N; i++) {
            int a = r.nextInt(101);
            scores[i] = a;
            int c = scores[i];
            
            if (c<min) min = c;
            if (c>max) max = c;
            
            sum += c;
            
            System.out.println(c);
        }
        
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.println("Average score: " + (double) sum/N);
    }
}
