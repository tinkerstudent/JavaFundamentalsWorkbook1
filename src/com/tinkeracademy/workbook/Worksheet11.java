package com.tinkeracademy.workbook;
 
public class Worksheet11 {
    public static void main(String[] args) {
        String sentence = "I love a peanut butter and jelly sandwich";
        String part1 = sentence.substring(0, 7);
        String part2 = sentence.substring(9, 12);
        String part3 = sentence.substring(33, 34);
        System.out.println(part1 + part2 + part3);
    }
}
