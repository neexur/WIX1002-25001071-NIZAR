/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Abah
 */
public class WIX1002LAB_TASK {

    public static boolean isBoomerang(int[][] points) {
        int x1 = points[0][0];        
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];       
        int y3 = points[2][1];
        
        return (y2-y1)/(x2-x1) != (y3-y2)/(x3-x2);
    }
    
    public static void main(String[] args) {
        boolean result = isBoomerang(new int[][] {
            {1,1},           
            {3,3},
            {4,5},
        });
        
        System.out.println(result ? "It's a boomerang" : "It's not a boomerang");
    }
}
