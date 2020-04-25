package com.javaloop;

public class Practice {
	public static void main(String[] args) {
		String country= "UNITED STATES OF AMERICA";
				for(int i=country.length()-1;i>0;i--) {
					System.out.println(country.charAt(i));
					
				}
				StringBuilder builder=new StringBuilder("UNITED STATES OF AMERICA");
			
				System.out.println(builder.reverse());
				
				for(int i=0;i<country.length();i++) {
					if(country.charAt(i)=='E'){
				System.out.println(country.charAt(i));	
				}
				}
				String s="MOM";
				StringBuilder builder1 =new StringBuilder(s);
				if(s.equals(builder1.reverse().toString())){
					System.out.println("A Palnigdrome number");
				}else {System.out.println("Not A Palnigdrome number");
					
				}
				
				String s1="10,422.75$";
				System.out.println(s1.replace(",", "").replace("$",""));
				}
				
			}

	
	


