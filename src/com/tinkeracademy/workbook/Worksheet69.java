package com.tinkeracademy.workbook;
 
import java.util.Arrays;

public class Worksheet69 {
    public static void main(String[] args) {
       int[] arr = new int[] { 4, 8, 7, 6, 2, 1 };
       System.out.println("Before Sort " + Arrays.toString(arr));
       for (int i = 0; i < arr.length - 1; i++) {
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[i] > arr[j]) {
                   int tmp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = tmp;
               }
           }
       }
       System.out.println("After Sort " + Arrays.toString(arr));
    }
}
