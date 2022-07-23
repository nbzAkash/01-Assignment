package com.practice.string;

import java.util.Scanner;

public class StringOps {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		printChars(s);
	}
	
	public static void printChars(String s) {
		for(int i=0; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}
}
