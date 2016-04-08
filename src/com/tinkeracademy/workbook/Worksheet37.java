package com.tinkeracademy.workbook;
 
public class Worksheet37 {
    public static void main(String[] args) {
       int sum = 0;
       int firstNum = 1;
       int lastNum = 100;       
       for (int i = firstNum; i <= lastNum; i++) {
           sum = sum + i;
       }
       System.out.println("sum from "+firstNum+" to "+lastNum+" is "+sum);
    }
}
