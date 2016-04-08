package com.tinkeracademy.workbook;
 
public class Worksheet65 {
    
    public static void main(String[] args) {
        String sentence = "You're a wizard, Harry!";
        String reversed = "";
        for (int i = 0; i < sentence.length(); i++) {
            reversed = sentence.charAt(i) + reversed;
        }
        System.out.println("Reversed sentence is " + reversed);
     }
}
