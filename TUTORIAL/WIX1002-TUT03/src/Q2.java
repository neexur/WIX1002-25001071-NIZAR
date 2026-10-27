/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */
public class Q2 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 3;
        if (num1 == num2) 
            System.out.println("Number 1 is equal to Number 2.");
        
        int x=3,y=2,z=1;
        if (x > y) {
            if (x > z) {
                System.out.println("x is the largest number");
            }
        }
        
        String s1 = "Ayam", s2 = "Goreng";
        if (s1.equals(s2)) {
            System.out.println("They are equal strings");
        } else if (!s1.equals(s2)) {
            System.out.println("There are not equal strings");
        }
        
        if (x > 0 || y > 0)
            System.out.println("Either x or y is positive");
    }
}
