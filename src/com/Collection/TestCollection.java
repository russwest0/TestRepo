package com.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class TestCollection {
	public static void main(String[] args){
		
		HashMap hashmap=new HashMap();
		Hashtable hashtable=new Hashtable();
		
		ArrayList arrayList=new ArrayList();
		Vector vector=new Vector();
		System.out.println("hashmap"+hashmap.size());
		System.out.println("hashset"+hashtable.size());
		System.out.println("arraylist"+arrayList.size());
		System.out.println("vector"+vector.size());
	}
}
