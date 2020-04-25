package com.Listpractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PractiseArraylist {
	public static void main(String[] args) {
		int[]a= {10,20,30};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array max value="+Arrays.stream(a).max().getAsInt());
		System.out.println("Array min value="+Arrays.stream(a).min().getAsInt());
		System.out.println("Array first value ="+ a[0]);
		System.out.println("Array last value ="+ a[a.length-1]);
		List<Integer>obj=new ArrayList<>();
		obj.add(40);
		obj.add(50);
		obj.add(60);
		System.out.println("List max value ="+ Collections.max(obj));
		System.out.println("List min value ="+ Collections.min(obj));
		System.out.println("List first value="+ obj.get(0));
		System.out.println("List last value="+ obj.get(obj.size()-1));
		
		
		List<String>Mylist=new ArrayList<>();
		Mylist.add("Milk");
		Mylist.add("Meat");
		Mylist.add("Fish");
		System.out.println(Mylist);
		for(int i=0;i<Mylist.size();i++) {
			System.out.println(Mylist.get(i));
	}
	}
}
