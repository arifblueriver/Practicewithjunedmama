package com.javaloop;

public class Looprevers {
	public static void main(String[] args) {
		String a="UNITED STATES OF AMERICA";
		for(int i=a.length()-1;i>0;i--) {
			System.out.println(a.charAt(i));
			
		}
		StringBuilder builder=new StringBuilder("UNITED STATES OF AMERICA");
	
		System.out.println(builder.reverse());
	}

}
