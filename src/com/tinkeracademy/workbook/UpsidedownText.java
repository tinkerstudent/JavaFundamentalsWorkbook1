package com.tinkeracademy.workbook;

public class UpsidedownText {
	
	public static void main(String[] args) {
		
		String[] up = {
				"a", "b", "c", "d", "e", "f", "g", "h", 
				"i", "j", "k", "l", "m", "n", "o", "p", 
				"q", "r", "s", "t", "u", "v", "w", "x", 
				"y", "z", "A", "B", "C", "D", "E", "F", 
				"G", "H", "I", "J", "K", "L", "M", "N", 
				"O", "P", "Q", "R", "S", "T", "U", "V", 
				"W", "X", "Y", "Z", "0", "1", "2", "3", 
				"4", "5", "6", "7", "8", "9", ", ", ".", 
				"?", "!", "\"", "'", "`", "(", ")", "[", 
				"]", "{", "}", "<", ">", "&", "_", " "
		};
		
		String[] down = {
				"\u0250", "q",      "\u0254", "p",      "\u01DD", "\u025F", "\u0183", "\u0265", 
				"\u1D09", "\u027E", "\u029E", "l",      "\u026F", "u",      "o",      "d",
				"b",      "\u0279", "s",      "\u0287", "n",      "\u028C", "\u028D", "x",      
				"\u028E", "z",      "\u2200", "B",     "\u0186", "D",      "\u018E", "\u2132", 
				"\u05E4", "H",      "I",      "\u017F", "K",      "\u02E5", "W",      "N", 
				"O",      "\u0500", "Q",      "R",      "S",      "\u2534", "\u2229", "\u039B", 
				"M",      "X",      "\u2144", "Z",      "0",      "\u0196", "\u1105", "\u0190", 
				"\u3123", "\u03DB", "9",      "\u3125", "8",      "6",      "'",      "\u02D9", 
				"\u00BF", "\u00A1", ",,",       ",",    ",",      ")",      "(",      "]",
				"[",      "}",      "{",      ">",      "<",      "\u214B", "\u203E", " "
		};
		
		String sentence = "Hey, Look, Greg has a purse!"; // Step 01
		String upsidedownSentence = ""; // Step 02
		for (int i = 0; i < sentence.length(); i++ /*Step 03*/) { 
			char ch = sentence.charAt(i); // Step 04
			String s = String.valueOf(ch); // Step 05
			for (int j = 0; j < up.length; j++ /*Step 06*/) {
				String u = up[j]; // Step 07
				boolean isEquals = u.equals(s); // Step 08
				if (isEquals /*Step 09*/) { 
					String rev = down[j]; // Step 10
					upsidedownSentence = rev + upsidedownSentence; // Step 11
				}
			}
		}
		System.out.println(upsidedownSentence); // Step 12
	}
	
}