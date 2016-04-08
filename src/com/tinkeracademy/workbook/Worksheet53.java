package com.tinkeracademy.workbook;
 
public class Worksheet53 {
    public static void main(String[] args) {
       int factorial = 1;
       int firstNum = 1;
       int lastNum = 10;       
       for (int i = firstNum; i <= lastNum; i++) {
    	   factorial = factorial * i;
       }
       System.out.println("1x2x..x10="+factorial);
    }
}
