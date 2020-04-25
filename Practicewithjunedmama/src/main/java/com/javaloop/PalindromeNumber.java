package com.javaloop;

public class PalindromeNumber {public static void main(String[] args) {
	String s="MOM";
	StringBuilder builder =new StringBuilder(s);
	if(s.equals(builder.reverse().toString())){
		System.out.println("A Palnigdrome number");
	}else {System.out.println("Not A Palnigdrome number");
		
	}
	}
}


