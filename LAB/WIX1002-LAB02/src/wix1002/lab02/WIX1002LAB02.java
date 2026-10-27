/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wix1002.lab02;
import java.util.*;

/**
 *
 * @author Abah
 */
public class WIX1002LAB02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q6();
    }
    
    private static void Q1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fahrenheit: ");
        double fah = in.nextDouble();
        double cel = (fah-32)/1.8;
        System.out.printf("Celcius: %.2f%n", cel);
        in.close();
    }
    
    public static void Q2() {
        double P, D, R, Y, M;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter car price: ");
        P = in.nextDouble();
                
        System.out.println("Enter down payment: ");
        D = in.nextDouble();
                
        System.out.println("Enter interest rate (%): ");
        R = in.nextDouble();
                
        System.out.println("Enter loan duration (year): ");
        Y = in.nextDouble();
                
        M = (P-D)*(1+R*Y)/(Y*12);
        System.out.printf("Your monthly payment: %.2f%n", M);
    }
    
    public static void Q3() {
        Random r = new Random();
        int n1 = r.nextInt(10,51);        
        int n2 = r.nextInt(10,51);
        int n3 = r.nextInt(10,51);
        int sum = n1+n2+n3;
        double average = sum/3.0;
        
        System.out.println("Number 1: " + n1);
        System.out.println("Number 2: " + n2);
        System.out.println("Number 3: " + n3);
        
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
    }
    
    public static void Q4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total seconds: ");
        long inputSeconds = in.nextLong();
        long hours = inputSeconds/3600;
        long remainingSeconds = inputSeconds % 3600;
        long minutes = remainingSeconds/60;
        long seconds = remainingSeconds%60;
        
        System.out.println(inputSeconds + " is " + hours + " hours " + minutes + " minutes " + seconds + " seconds.");
    }
    
    public static void Q5() {
        Random r = new Random();
        int num = r.nextInt(0,10001);
        int numDuplicate = num;
        int digits = 0;
        
        System.out.println("Number is: " + num);
        
        do {
            numDuplicate *= 0.1;
            digits++;
        } while (numDuplicate > 0.1);
        
        System.out.println("Digit is: " + digits);
    }
    
    public static void Q6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amout of water in gram: ");
        int M = in.nextInt();
        System.out.println("Enter the initial temperature in Fahrenheit: ");
        double initial = in.nextDouble();
        System.out.println("Enter the final temperature in Fahrenheit: ");
        double finalT = in.nextDouble();
        double Q = M * (finalT - initial) * 4184;
        
        System.out.printf("The energy needed is: %e%n", Q);
    }
}
