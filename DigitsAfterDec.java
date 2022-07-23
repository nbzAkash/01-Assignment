package com.practice.string;

import java.util.Scanner;

public class DigitsAfterDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String no = sc.nextLine();
		dgt(no);

	}
    public static void dgt(String no) {
    	int pos = no.indexOf('.');
    	if(pos >= 0) {
    		String dgt = no.substring(pos + 1);
    		System.out.println(dgt);
    	}else {
    		System.out.println("");
    	}
    }
}
