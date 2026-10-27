/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        boolean questionA = 3*8 == 27;
        System.out.println("a) 3x8=27 " + questionA);
        
        Scanner in = new Scanner(System.in);
        System.out.println("b) Enter a number");
        int num = in.nextInt();
        String output = num%2 == 1 ? "It's odd" : "It's even";
        System.out.println(output);
        
        char c = 'k';
        if (Character.isUpperCase(c)) {
            System.out.println("c) " + c + " is a capital letter");
        } else {
            System.out.println("c) " + c + " is not a capital letter");
        }
        
        String str1 = "Apple";
        String str2 = "orange";
        if(str1.compareToIgnoreCase(str2) <= 0) {
            System.out.println("d)" + str1 + ", " + str2);
        } else {
            System.out.println("d) " + str2 + ", " + str1);
        }
        
        System.out.println("d) Enter number 0-6");
        int input = in.nextInt();
        switch (input) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default: 
                System.out.println("Enter 0-6 la");
                break;
        }         
    }
}
