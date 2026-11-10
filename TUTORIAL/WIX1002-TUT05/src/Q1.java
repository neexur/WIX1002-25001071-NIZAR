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
        //a
        float[] flo = new float[12];
        
        //b
        String AE = "ABCDE";
        char[] cha = new char[AE.length()];
        for (int i=0; i<AE.length(); i++) cha[i] = AE.charAt(i);        
        
        //c 
        String[] students = new String[100];
        
        //d
        int[][] table = new int[6][2];
        
        //e
        int[][] matrix = {
            {6, 9},
            {2, 5},
            {4, 6}
        };
        
        //f
        matrix[1][1] = 4;
        matrix[2][0] = 3;
        matrix[2][1] = 7;
        
        // g
        String[] contact = new String[4];
        for (String c : contact) {
            System.out.println(c);
        }
    }
}
