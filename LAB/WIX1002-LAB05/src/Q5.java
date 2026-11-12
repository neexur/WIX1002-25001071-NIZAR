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
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = r.nextInt(101);
            System.out.print(arr[i] + (i == arr.length-1 ? "" : ", "));
        }
        System.out.println();
        
        // Selection sort
        for (int i = 0; i < 20-1; i++) {
            for (int j = i+1; j < 20; j++) {
                int temp = arr[i];
                if (arr[i] < arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < 20; i++) System.out.print(arr[i] + (i == arr.length-1 ? "" : ", "));
        System.out.println();
        
        System.out.print("Enter number to search: ");
        int search = in.nextInt();
        
        int i=0;
        boolean found = false;
        for(; i<20; i++) {
            if (search == arr[i]) {
                found = true;
                break;
            }
        }
        
        if (found) System.out.println(search + " Found \nLinear Search - " + i+1 + " Loops" );
        else System.out.println(search + " not found");
    }
}
