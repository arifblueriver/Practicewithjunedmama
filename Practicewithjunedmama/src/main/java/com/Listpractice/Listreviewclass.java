package com.Listpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Listreviewclass {
public static void main(String[] args) {
	List<Integer> mylist=new ArrayList<>();
	mylist.add(10);
	mylist.add(20);
	mylist.add(30);
	mylist.add(40);
	mylist.add(10);
	Set<Integer> mylistset=new HashSet<>(mylist);
	Set<Integer> mylistset1=new TreeSet<>(mylist);
	System.out.println(mylistset1);
	System.out.println(mylistset);

	System.out.println(mylist);
	for(int i=0;i<mylist.size();i++) {
		System.out.println(mylist.get(i));
	}
	int maxnumber=Collections.max(mylist);
	System.out.println(maxnumber);
	int minnumber=Collections.max(mylist);
	System.out.println(minnumber);
	Collections.sort(mylist);
	System.out.println(mylist);
	Collections.reverse(mylist);
	System.out.println();
	List<String>mylist2=new ArrayList<>();
	mylist2.add("sarower");
	mylist2.add("sarower");
	mylist2.add("ahmed");
	mylist2.add("null");
	mylist2.add("null");
	Set<String>myhashset=new HashSet<>();
	myhashset.add("sarower");
	myhashset.add("sarower");
	myhashset.add("ahmed");
	myhashset.add("null");
	myhashset.add("null");
	Set<String>mylinkedset=new LinkedHashSet<>();
	mylinkedset.add("sarower");
	mylinkedset.add("sarower");
	mylinkedset.add("ahmed");
	mylinkedset.add("null");
	mylinkedset.add("null");
	Set<String>mytreeset=new TreeSet <>();
	mytreeset.add("sarower");
	mytreeset.add("sarower");
	mytreeset.add("ahmed");
	mytreeset.add("null");
	mytreeset.add("null");
System.out.println(mytreeset);



		
}
}
