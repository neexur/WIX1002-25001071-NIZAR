

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */

public class Q6 {
    static boolean isPrime(int n) {
        if (n<=1) return false;
        for (int i=2; i*i<=n; i++) if(n%i == 0) return false;
        return true;
    }
    
    static int reverse(int n) {
        String str = "", strN = n + "";
        for (int i=strN.length()-1; i>=0; i--) str += strN.charAt(i);
        return Integer.parseInt(str);
    }
    
    static int alsoReverse(int n) {
        int r = 0;
        
        while (n>0) {
            r *= 10;
            r += n%10;
            n /= 10;
        }
        
        return r;
    }
    
    static boolean isPalindromicPrime(int n) {
        return isPrime(n) && n == reverse(n);
    }    
    
    static boolean isEmirp(int n) {
        return isPrime(n) && isPrime(reverse(n)) && n != reverse(n);
    }
    
    public static void main(String[] args) {
        System.out.println(alsoReverse(12345) + "");
        
        final int TOTAL_NUMBER = 20;
        int count = 0, number = 1;
        
        System.out.printf("First %d palindromic prime: %n", TOTAL_NUMBER);
        while (count < TOTAL_NUMBER) {
            if (isPalindromicPrime(number)) {
                System.out.print(number + "\t");
                if((count+1)%10==0) System.out.println();
                count++;
            }
            number++;
        }
        
        System.out.println();
        
        count = number = 0;
        
        System.out.printf("First %d emirp: %n", TOTAL_NUMBER);
        while (count < TOTAL_NUMBER) {
            if (isEmirp(number)) {
                System.out.print(number + "\t");
                if((count+1)%10==0) System.out.println();
                count++;
            }
            number++;
        }
    }
}
