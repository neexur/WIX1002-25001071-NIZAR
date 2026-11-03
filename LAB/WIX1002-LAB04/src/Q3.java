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
        Scanner in = new Scanner(System.in);
        int counter = 0;
        double minimum = -Double.MAX_VALUE, maximum = Double.MAX_VALUE, sum = 0, sumSquared = 0, sd = 0, average = 0; 
        
        while (true) {
            System.out.print("Enter a score [negative score to quit]: ");
            double score = in.nextInt();
            
            if (score < 0) break;
            
            if (score > maximum) maximum = score;
            if (score < minimum) minimum = score;
            
            counter++;
            sum += score;
            sumSquared += score*score;
        }
        
        average = (double) sum/counter;
        sd = Math.sqrt((sumSquared - (sum*sum/counter))/(counter-1));
        
        System.out.println("Minimum score: " + minimum);
        System.out.println("Maximum score: " + maximum);
        System.out.println("Average score: " + average);
        System.out.printf("Standard Deviation: %.2f%n", sd);
        
        in.close();
    }
}
