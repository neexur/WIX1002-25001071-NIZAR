/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wix1002.labtask04;

import java.util.Scanner;

/**
 *
 * @author Abah
 */
public class WIX1002LABTASK04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 1. Get the input from users Input
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            System.out.print("Enter the first day of the year (0-6): ");
            int firstDayOfYear = sc.nextInt();

            // 2. Perform required calculation Processing
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            int dayUntilMay = 31 + (isLeapYear ? 29 : 28) + 31 + 30;
            int firstDayOfMay = (firstDayOfYear + dayUntilMay) % 7;

            String columnFormat = "%4s";
            String format = "%4s%4s%4s%4s%4s%4s%4s%n"; // string formatting - different types of string formatting

            // 3. Print the calendar of November Output
            System.out.println("November " + year);
            System.out.printf(format, "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
            for (int i = 0; i < firstDayOfMay+1; i++) {
                System.out.printf(columnFormat, "");
            }
            for (int i = 1; i <= 30; i++) {
                System.out.printf(columnFormat, i);
                if ((i + firstDayOfMay+1) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println();
        }
    }
}
