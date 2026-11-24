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
        System.out.println(maxxx(3,7,21));
        System.out.println(isSquare(40));
        nOfLettersAndNumber("Ayam goreng 123");
        
        // f
        int[] randomNumbers = new int[10];
        generateNumbers(randomNumbers);
        
        for(int n : randomNumbers) System.out.println(n);
        
        areaAndCircumference(23);
        questionH();
    }
    
    // a
    static int maxxx(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }
    
    // b
    static boolean isSquare(int num) {
        return Math.sqrt((double) num)%1 == 0;
    }
    
    // c
    static int C(int n, int k) {
        int nfactorial = 1;
        int kfactorial = 1;
        int nmkfactorial = 1;
                
        for (int i=1; i<=n; i++) nfactorial *= i;
        for (int j=1; j<=k; j++) kfactorial *= j;
        for (int nm=1; nm<=(n-k); nm++) nmkfactorial *= nm;
        
        return (nfactorial/(kfactorial*nmkfactorial));
    }
    
    // d
    static boolean isPentagonal(int num) {
         if (num <= 0) return false;
         int n = 0, pentagonal = 1;
         
         while (pentagonal < num) {
             pentagonal = (n*(3*n-1))/2;
             n++;
         }
         
         if (pentagonal == num) return true;
         else return false;
    }
    
    // e
    static void nOfLettersAndNumber(String str) {
        int l = 0, d = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) l++;
            if (Character.isDigit(str.charAt(i))) d++;
        }
        
        System.out.printf("String has %d letters and %d digits%n", l, d);
    }
    
    // f
    static void generateNumbers(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) arr[i] = r.nextInt(101);
    }
    
    // g
    static void areaAndCircumference(int radius) {
        double area = Math.PI*radius*radius;
        double circ = 2*Math.PI*radius;
        
        System.out.printf("Area: %.2f and Circumference: %.2f%n", area, circ);
    }
    
    // h
    static void questionH() {
        Random r = new Random();
        int[] generated = new int[11];
        int randomNumber;
        
        do {
            randomNumber = r.nextInt(11);
            generated[randomNumber]++;
            System.out.print(randomNumber + "\t");
            
            if (generated[randomNumber] > 1) break;
        } while (true);
        
        System.out.println("The number generated twice is " + randomNumber);
    }
}