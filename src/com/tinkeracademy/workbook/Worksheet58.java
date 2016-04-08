package com.tinkeracademy.workbook;
 
public class Worksheet58 {
    
    public static void main(String[] args) {
        String sentence = "I'll be famous one day, but for now I'm stuck in middle school with a bunch of morons.";
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
        	if (sentence.charAt(i) == ' ') {
        		count++;
        	}
        }
        count++;
        System.out.println("# words = " + count);
     }
}
