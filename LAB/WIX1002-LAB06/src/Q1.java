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
        for (int i=1; i<=20; i++)
            System.out.printf("%d) %d%n", i, triangleNumber(i));
}
    
    static int triangleNumber(int n) {
        int result = 0;
        
        for (int i=1; i<=n; i++) result += i;
        
        return result;
    }
    
    static int otherApproach(int n) {
        return n*(n+1)/2;
    }
}
