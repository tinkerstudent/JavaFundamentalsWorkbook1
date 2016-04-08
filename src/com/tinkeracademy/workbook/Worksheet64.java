package com.tinkeracademy.workbook;
 
public class Worksheet64 {
    
    public static void main(String[] args) {
        String sentence = "You're a wizard, Harry!";
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
        	if (sentence.charAt(i) == ' ') {
        		count++;
        	}
        }
        System.out.println("Number of blank chars=" + count);
     }
}