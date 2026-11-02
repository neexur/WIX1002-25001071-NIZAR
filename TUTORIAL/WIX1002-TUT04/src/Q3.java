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
        int f1 = 1, f2 = 1;
        
        System.out.println("1) " + f1);        
        System.out.println("2) " + f2);
        
        for (int i=3; i<=10; i++) {
            int fn = f1+f2;
            
            System.out.println(i + ") " + fn);
            
            f1 = f2;
            f2 = fn;
        }
    }
}
