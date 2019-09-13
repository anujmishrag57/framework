package com.learnautomation.selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class switchClass {
	
		
	public static void main(String[] args) {
		
		//entry set in hash Map
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("A", 1);
		hmap.put("B", 10);
		hmap.put("E", 1);
		hmap.put("C", 100);
		hmap.put("D", 10000);
		
		System.out.println(hmap);
		System.out.println(hmap.size());
		
		Set key= hmap.keySet();
		System.out.println(key);
		Collection col= hmap.values();
		System.out.println(col);
		
		Set sp= hmap.entrySet();
		System.out.println(sp);
		
}
}

