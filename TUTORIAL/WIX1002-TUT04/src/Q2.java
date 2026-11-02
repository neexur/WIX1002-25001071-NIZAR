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
        //a 
        int sum = 0;
        for (int x = 10; x > 0; x--)
            sum += x;
        
        //b
        int y=0, x=0;
        do {
            x+= 2;
            y+= x;
            System.out.println(x + " and " + y);
        } while (x < 100);
        
        //c 
        for (x=1, y=2; x<y; x++, y-=2) {
            System.out.println(x + " " + y);
        }
        
        //d
        int i=1;
        while (i<10) {
            i++;
            if (i==10)
                System.out.println("Program End");
        }
    }
}
