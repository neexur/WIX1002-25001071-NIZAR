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
        
        while (p1 <= 100 && p2 <= 100) {
            if (counter%2 == 0) currentPlayer = 1;
            else currentPlayer = 2;
            
            int roll = r.nextInt(7);
            while (true) {
                if (roll == 6) {
                    System.out.println("Player " + currentPlayer + " roll: " + roll + " (total=" + p2);
                } else {
                    System.out.println("Player " + currentPlayer + " roll: " + roll + " (total=" + p2);
                    break;
                }
            }
            
            counter++;
        }
        
        if (p1 > 100) System.out.println("Player 1 wins");
        else System.out.println("Player 2 wins");
    }
}
