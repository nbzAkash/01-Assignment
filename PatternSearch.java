package com.practice.string;

import java.util.Scanner;

public class PatternSearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String patt = sc.nextLine();
		pattS(str,patt);
	}
	
	public static void pattS(String str, String patt) {
		int pos = str.indexOf(patt);
		while(pos >= 0) {
			System.out.println(pos+"");
			pos = str.indexOf(patt,pos+1);
		}
		
	}

}
