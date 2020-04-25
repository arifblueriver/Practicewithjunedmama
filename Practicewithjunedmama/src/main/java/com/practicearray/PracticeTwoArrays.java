package com.practicearray;

import java.util.Arrays;

public class PracticeTwoArrays {
	public static void main(String[] args) {
		int []a= {2,3,4,5,6,7,8};
		int []b= {7,8,9,10,20,30};
		int []c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];}
		for(int i=0;i<b.length;i++) {
			c[i+a.length]=b[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
