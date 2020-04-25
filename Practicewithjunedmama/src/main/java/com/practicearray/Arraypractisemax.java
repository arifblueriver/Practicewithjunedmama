package com.practicearray;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Arraypractisemax {
	

	public static void main(String[] args) {
		int[] a= {10,4,68,9};
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);}
		System.out.println(Arrays.stream(a).max().getAsInt());
		System.out.println(Arrays.stream(a).min().getAsInt());
int[]b= {55,22,77,33,99};
System.out.println(Arrays.toString(b));
Arrays.sort(b);
System.out.println(Arrays.toString(b));
ArrayUtils.reverse(b);
System.out.println(Arrays.toString(b));

	}
}


