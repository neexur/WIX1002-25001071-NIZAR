/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Random r = new Random();
        int randomInteger = r.nextInt(9999);
        int digits = 0;
        
        System.out.println(randomInteger);
        
        while (randomInteger > 0) {
            randomInteger /= 10;
            digits++;
        }
        
        System.out.println(digits);
    }
}
