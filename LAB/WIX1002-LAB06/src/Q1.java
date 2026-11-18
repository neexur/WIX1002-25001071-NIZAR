/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */
public class Q1 {
    public static void main(String[] args) {
        int num = 20;
        
        System.out.printf("Triangle number for %d is %d%n", num, triangleNumber(num));
    }
    
    static int triangleNumber(int n) {
        int result = 0;
        
        for (int i=1; i<=n; i++) result += i;
        
        return result;
    }
}
