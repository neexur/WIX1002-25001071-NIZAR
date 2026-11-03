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
        int p1 = 0, p2 = 0, currentPlayer = 1, counter = 0;
        
        Random r = new Random();
        int roll;
        
        while (p1 < 100 && p2 < 100) {
            do {
            roll = r.nextInt(6)+1;
            if (counter%2 == 0) p1 += roll;
            else p2 += roll;
            
            System.out.println("Player " + (counter%2+1) + " rolls " + roll);
            System.out.println(p1 + " | " + p2);
            
            } while (roll == 6);
            counter++;
        }
    }
}
