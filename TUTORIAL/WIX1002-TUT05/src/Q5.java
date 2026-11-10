/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abah
 */
public class Q5 {
    public static void main(String[] args) {
        String[] sentence = {};
        
        for (int i=0; i<sentence.length/2; i++) {
            String temp = sentence[i];
            sentence[i] = sentence[sentence.length-1-i];
            sentence[sentence.length-1-i] = temp;
        }
    }
}
