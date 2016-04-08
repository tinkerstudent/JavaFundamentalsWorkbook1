package com.tinkeracademy.workbook;
 
public class Worksheet12 {
    
    public static void main(String[] args) {
        String sentence = "I love a peanut butter and jelly sandwich";
        String part1 = sentence.substring(0, 9);
        String part2 = sentence.substring(16, 17);
        String part3 = sentence.substring(34, 37);
        System.out.println(part1+part2+part3);
     }
}
