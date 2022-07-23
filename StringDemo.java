package com.practice.string;

public class StringDemo {
	
	public static void main(String [] args) {
		String str="AKASH";
		 String  s2=str;
		 String s3="AKASH";
		 String s4= new String("AKASH");
		String str1 = new String("Rishu");
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.substring(1,4));
		System.out.println(str.substring(3));
		System.out.println(str.concat(str1));
		System.out.println(str.contentEquals("Rishu"));
		System.out.println(str.indexOf("R"));
		System.out.println(str1.startsWith("R"));
		System.out.println(str==s2);
		System.out.println(s2.equals(s3));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
		
	}

}
