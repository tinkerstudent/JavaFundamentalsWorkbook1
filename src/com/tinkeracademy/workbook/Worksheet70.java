package com.tinkeracademy.workbook;
 
public class Worksheet70 {
    public static void main(String[] args) {
       char[] alphabets = new char[] { 'a', 'b', 'c', 'd', 'e', 
               'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
               'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
       char[] code = new char[] { 't', 'h', 'i', 's', 'm', 
               'a', 'w', 'c', 'o', 'd', 'e', 'l', 'v', 'r', 'b', 'y',
               'x', 'j', 'f', 'g', 'k', 'n', 'p', 'q', 'u', 'z', ' '};
       String sentence = "i love sugar cookies";
       String codedSentence = "";
       for (int i = 0; i < sentence.length(); i++) {
           for (int j = 0; j < alphabets.length; j++) {
               if (sentence.charAt(i) == alphabets[j]) {
                   codedSentence = codedSentence + code[j];
               }
           }
       }
       System.out.println(sentence);
       System.out.println(codedSentence);
    }
}
