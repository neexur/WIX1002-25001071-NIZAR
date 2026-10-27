/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wix1002.t2;
import java.util.Scanner;

/**
 *
 * @author Abah
 */
public class WIX1002T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        q7();
    }
    
    static void q1() {
        System.out.println("Faculty of Computer Science and Information Technology");
        System.out.println("Faculty of Computer Science \nand Information Technology");
    }
    
    static void q2() {
        System.out.println("\"SDN\" - Software-defined networking");
    }
    
    static void q3() {
        System.out.println("Java Programming"); 
        System.out.println("Introduction to Java!");
        System.out.println("\t is the horizontal tab character"); 
        System.out.println("Java is case sensitive!" ); 
    }
    
    static void q4() {
        int matricNumber = 25001071;
        double pi = Math.PI;
        boolean M = false;
        float P = 8.8e9f;
        char letter = 'U';
        final String PRO = "Java";
    }
    
    static void q5() {
        //a
        double AMOUNT = 32.5; 
        AMOUNT += 10; 
        System.out.println("The amount is " + AMOUNT); 
        //b
        String chapter = "Summary";
        System.out.println(chapter);
        //c
        int num = 0;
        num++;
        int num1 = num;
        //d
        float numm = 3000;
        System.out.printf("%4.2f\n", numm);
        //e
        String contact;
        Scanner keyboard = new Scanner(System.in); 
        contact = keyboard.nextLine();
        keyboard.close();
    }
    
    static void q6() {
        Scanner keyboard = new Scanner(System.in);
        double  diameter = keyboard.nextDouble();
        System.out.println("Enter diameter: ");
        double  circumference = diameter * Math.PI;
        System.out.printf("The circumference of the circle is: %.3f\n",circumference);
        keyboard.close();
    }
    
    static void q7() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter value in inches: ");
        double inches = keyboard.nextDouble();
        double meters = inches*2.54/100;
        System.out.printf("%.2f\n",meters);
        keyboard.close();
    }
}
