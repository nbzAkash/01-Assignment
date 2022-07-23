package com.practice.string;

import java.util.Scanner;

public class SubString {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printSS(str);
	}
    
	public static void printSS(String str) {
		for(int si=0; si<str.length()-1;si++) {
			for(int ei=si+1; ei<=str.length(); ei++) {
				String ss= str.substring(si,ei);
				System.out.println(ss);
			}
		}
	}
}
