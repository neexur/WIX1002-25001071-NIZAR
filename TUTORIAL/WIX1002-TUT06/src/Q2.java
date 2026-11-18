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
        sortDecreasing(new int[]{12,41,300,31});
    }
    
    static void sortDecreasing(int[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
        System.out.println("Sorted in decreasing order: " + Arrays.toString(numbers));
    }
}
