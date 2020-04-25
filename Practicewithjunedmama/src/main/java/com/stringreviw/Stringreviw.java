package com.stringreviw;

public class Stringreviw {
	
	static String a="sarower";
	static String obj =new String("sarower");
	static StringBuffer Bufferobj =new StringBuffer("Sumon"); 
	static StringBuilder Builderobj =new StringBuilder("Dora"); 
public static void main(String[] args) {
	
	//System.out.println(a.concat("Ahmed"));
	//System.out.println(obj.concat("Ahmed"));
	//System.out.println(a);
	//System.out.println(obj);// immutable = change not posible===> store in string pool
	
	//System.out.println(Bufferobj);
	//System.out.println(Bufferobj.append("Ahmed"));
	//System.out.println(Bufferobj);//mutable=change possible==> store in java heap area
	
	System.out.println(Builderobj);
	System.out.println(Builderobj.append("Hossain"));
	System.out.println(Builderobj);//mutable=change possible==> store in java heap area
	
}

}
