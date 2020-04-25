package com.practicearray;

import java.util.Arrays;

public class PractiseArrays {
public static void main(String[] args) {
	int[]a= {10,20,30,40,50,60,70,80,90,100};
	for(int i:a) {
		System.out.println(i);
	}
	System.out.println(a[0]);
	System.out.println(a[a.length-1]);
	System.out.println(Arrays.toString(a));
	System.out.println("max number from array="+Arrays.stream(a).max().getAsInt());
	System.out.println("max number from array="+Arrays.stream(a).min().getAsInt());

}
}
