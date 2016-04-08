package com.tinkeracademy.workbook;
 
public class Worksheet72 {
    
    public static void main(String[] args) {
        String[] lowercaseAlphabets = {
                "c", "o", "k", "i", "e", "s"
        };
        String[] uppercaseAlphabets = {
                "C", "O", "K", "I", "E", "S"
        };
        String lowercaseWord = "cookies";
        String uppercaseWord = "";
        for (int i=0; i<lowercaseWord.length(); i++) {
            for (int j = 0; j < lowercaseAlphabets.length; j++) {
                String str = String.valueOf(lowercaseWord.charAt(i));
                if (str.equals(lowercaseAlphabets[j])) {
                    uppercaseWord = uppercaseWord + uppercaseAlphabets[j];
                }
            }
        }
        System.out.println(uppercaseWord);
    }
}
