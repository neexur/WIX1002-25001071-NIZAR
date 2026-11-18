/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */
public class Q4 {
    public static void main(String[] args) {
        System.out.println(GCD(24, 8) + "");
        System.out.println(GCD(200, 625) + "");
    }
    
    static int GCD(int x, int y) {
        if (y > x) {
            int temp = x;
            x = y;
            y = temp;
        }
        
        while(x%y != 0) {
            int temp = y;
            y = x%y;
            x = y;
        }
        
        return y;
    }
}
