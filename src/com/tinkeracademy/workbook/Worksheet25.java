package com.tinkeracademy.workbook;
 
public class Worksheet25 {
    
    public static void main(String[] args) {
        String sentence = "Before we begin our banquet, I would like to say a few words. And here they are: Nitwit! Blubber! Oddment! Tweak! Thank you. Is he a bit mad? Mad? He's a genius! Best wizard in the world! But he is a bit mad, yes. Potatoes, Harry?";
        boolean isEqual = sentence.charAt(4) == 'e';
        if (isEqual) {
            System.out.print("e all be good");
        } else {
            System.out.print("e all still be good");
        }
    }
}
