/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(101), counter = 2, current = 1;
        
        while (n > 0) {
            if (isPrime(counter)) {
                System.out.println(current + ") " + counter);
                current++;
                n--;
            } 
            counter++;
        }
    }
    
    static boolean isPrime(int num) {
        for (int i=2; i*i<=num; i++) {
            if (num%i == 0) return false;
        }
        return true;
    }
}
