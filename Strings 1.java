package com.javacookbook.strings;

import java.io.*;
import java.util.Date;

public class test {
	public static void main(String ... strings) throws IOException {
		
		// String Literal
		String quote = "To be or not to be";
		
		// Length of a String
		System.out.println(quote);
		System.out.println("Length " + quote.length());
		
		quote = "";
		
		// Checking whether a String is empty or not 
		boolean empty = quote.isEmpty();
		System.out.println("Is empty " + empty);
		
		// String Concatenation
		String name = "John " + "Smith";
		System.out.println("name - " + name);
		
		name = "John ".concat("Smith");
		System.out.println("name - " + name);
		
		// Multi-line strings
		String poem = "'Twas brillig, and the slithy toves\n" +
					  " Did gyre and gimble in the wabe:\n"   +
					  "All mimsy were the borogoves,\n"       +
					  " And the mome raths outgrabe.\n";
		System.out.println(poem);
		
		// A String can be constructed from an array of characters.
		char [] data = new char[] { 'L', 'e', 'm', 'm', 'i', 'n', 'g' };
		String lemming = new String(data);
		System.out.println(lemming);
		
		// A string can be constructed from an array of Bytes
		byte [] data1 = new byte[] {(byte) 82, (byte) 65, (byte) 86, (byte) 73};
		
		String abc = null;
		
		try {
			// abc = new String(data1, "ISO8859_1");
			abc = new String(data1, "CP1252");
			System.out.println("abc = " + abc);
		} catch (IOException e) {
			System.out.println("Exception when creating String ... abc");
		}
		
		// Accessing a String character at a time
		String s = "Newton";
		for (int i = 0; i < s.length(); i++)
			System.out.println(s.charAt(i));
		
		// Convert a String to a Char array
		char [] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		for (int i = 0; i < chars.length; i++) 
			System.out.println(chars[i]);
		
		// Converting Primitive types to String
		String one = String.valueOf(1);
		String two = String.valueOf(2.3456f);
		String notTrue = String.valueOf(false);
		
		System.out.println("one = " + one + " two = " + two + " notTrue = " + notTrue);
		
		// All Objects have a toString() method that is inherited from "Object" class. 
		
		Date date = new Date();
		String d1 = String.valueOf(date);     // This calls date.toString() method.
		String d2 = date.toString();          // Both these calls are same.
		System.out.println(d1);
		System.out.println(d2);
		
		date = null;
		d1 = String.valueOf(date);			// Returns a string "null"
		System.out.println(d1);
		
		//d2 = date.toString();				// throws NullPointerException
		
		// String concatenation using "+" internally invokes String.valueOf() method.
		
		String today = "" + new Date();
		System.out.println(today);
	}
}

