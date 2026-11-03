/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        int fday = 0;
        
        while (true) {       
            System.out.print("Enter first day of the year: ");
            fday = in.nextInt();
            
            if (fday > 6 || fday < 0) System.out.println("Invalid day");
            else break;
        }
        
        int daysBeforeMay = fday + 31 + 31 + 30;
        if ((year%4==0 && year%100>0) || year%400==0) daysBeforeMay += 29;
        else daysBeforeMay += 28;
        
        int daysBeforeAugust = daysBeforeMay + 31 + 30 + 31;
        
        int remainingDays = 31;
        int currentDay = 1;
        int offsetDays = daysBeforeMay%7;
        
        String dotw = "SMTWTFS";
        
        System.out.println("\nMAY");
        
        for (int i=0; i<7; i++) System.out.print(dotw.charAt(i) + "\t");
        System.out.println();
        
        for (int w=0; w<5; w++) {
            for (int d=0; d<7; d++) {
                if (offsetDays == 0) {
                    if (currentDay < remainingDays) System.out.print(currentDay + "\t");
                    currentDay++;
                } else {
                    System.out.print("\t");
                    offsetDays--;
                }
            }
            System.out.println();
        }
        
        currentDay = 1;
        offsetDays = daysBeforeAugust%7;
        
        System.out.println("\nAUGUST");
        
        for (int i=0; i<7; i++) System.out.print(dotw.charAt(i) + "\t");
        System.out.println();
        
        for (int w=0; w<5; w++) {
            for (int d=0; d<7; d++) {
                if (offsetDays == 0) {
                    if (currentDay < remainingDays) System.out.print(currentDay + "\t");
                    currentDay++;
                } else {
                    System.out.print("\t");
                    offsetDays--;
                }
            }
            System.out.println();
        }
    }
}
