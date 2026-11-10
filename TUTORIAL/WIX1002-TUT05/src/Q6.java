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
        int num = r.nextInt(255);
        int[] arr = new int[8];
        int i;
        
        System.out.println(num);
        
        for (i=7; i>0; i--) {
            arr[i] = num%2;
            num /= 2;
        }
        
        for (; i<8; i++) {
            System.out.print(arr[i]);
        }
        
        System.out.println();
    }
}
