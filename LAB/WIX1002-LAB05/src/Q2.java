/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] record = new int[10];
        boolean[] generatedAt = new boolean[21];
        int counter = 0;
        
        while (counter < 10) {
            int n = r.nextInt(21);
            
            if(generatedAt[n]) continue;
            
            generatedAt[n] = true;
            record[counter] = n;
            counter++;
        }
        
        for (int i = 0; i<10; i++) {
            System.out.print(record[i] + ", ");
        }
    }
}
