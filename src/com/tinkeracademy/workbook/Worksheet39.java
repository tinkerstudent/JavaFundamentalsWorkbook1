package com.tinkeracademy.workbook;
 
public class Worksheet39 {
    public static void main(String[] args) {
       int sum = 0;
       int firstNum = 80;
       int lastNum = 0;       
       for (int i = firstNum; i <= lastNum; i++) {
            sum = sum + i;
      }
       System.out.println("sum from "+firstNum+" to "+lastNum+" is "+sum);
    }
}
