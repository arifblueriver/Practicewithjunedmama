package com.setpractise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetPractise {
	public static void main(String[] args) {
		int []a= {10,9,2,3,4,5,6,4,5};
		List<Integer>Mylist=new LinkedList<>(Arrays.asList(10,9,2,3,4,5,6,4,5));
		Set<Integer>Myset=new HashSet<>(Mylist);
		Set<Integer>Myset1=new HashSet<>(Arrays.asList(10,9,2,3,4,5,6,4,5));//handle duplicates
		
System.out.println(Myset1);

System.out.println(Mylist);
Collections.sort(Mylist);//asc order
System.out.println(Mylist);
Collections.reverse(Mylist);//desc order
System.out.println(Mylist);
Set<Integer>Myset2=new TreeSet<>(Arrays.asList(10,9,2,3,4,5,6,4,5));//handle duplicates & asc order
System.out.println(Myset2);
	
	}

}
