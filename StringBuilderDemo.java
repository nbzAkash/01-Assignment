package com.practice.string;


public class StringBuilderDemo {
	
	public static void main(String[]args) {
		
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.length());
        
        //append
        System.out.println(sb.append("Abc"));
        
        //insert
        sb.insert(2, "D");
        System.out.println(sb);
        
        //delete
        sb.deleteCharAt(2);
        System.out.println(sb);
        
        //update
        sb.setCharAt(5,'U');
        System.out.println(sb);
	}

}
