package com.demo;

import java.util.Arrays;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {

//		List<String> list =  (List<String>) new ArrayList();
		List<String> list = Arrays.asList("Rakesh","madhav");
		
		
		
		for(String s: list) {
			System.out.println(s);
		}
		
		
		list.forEach((key)-> System.out.print(key+" "));
		
		
		
		
		
		
		
		
		
	}

}
