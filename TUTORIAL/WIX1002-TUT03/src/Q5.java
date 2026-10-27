/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year");
        int year = in.nextInt();
        
        if ((year%4==0 && year%100>0) || year%400==0) 
            System.out.println("It's a leap year bitch");
        else 
            System.out.println("It's not a leap year :(");
    }
}
