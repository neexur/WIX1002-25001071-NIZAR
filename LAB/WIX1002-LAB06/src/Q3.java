/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */
public class Q3 {
    public static void main(String[] args) {
        reversed(new int[]{1,2,3,4,5,6,7,8,9,10});
    }
    
    static void reversed(int[] arr) {
        if (arr.length != 10) {
            System.out.println("Array must have 10 integers");
            return;
        }
        
        String result = "";
        
        for (int i=arr.length-1; i>=0; i--) {
            result += arr[i];
        }
        
        System.out.println("Reversed array: " + result);
    }
}
