package com.tinkeracademy.workbook;
 
public class Worksheet55 {
    public static void main(String[] args) {
       int sum = 0;
       int firstNum = 1;
       int lastNum = 100;       
       for (int i = firstNum; i <= lastNum; i++) {
           if (i % 2 == 0) {
               sum = sum + i;
           }
       }
       System.out.println("sum of even integers from "+firstNum+" to "+lastNum+" is "+sum);
    }
}
