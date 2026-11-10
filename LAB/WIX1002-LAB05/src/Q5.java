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
        Random r = new Random();
        
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = r.nextInt(101);
            System.out.print(arr[i] + (i == arr.length-1 ? "" : ", "));
        }
        System.out.println();
        
        Arrays.sort(arr);
        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + (i == arr.length-1 ? "" : ", "));
        }
        
        
    }
}
