package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsCopy {

	public static void main(String[] args) {
		
		/*
		 * Collections.copy(src,dest)
		 */
		List<Integer> source=new ArrayList<>();
		source.add(1);
		source.add(2);
		List<Integer> destination=new ArrayList<>();
		source.add(3);
		Collections.copy(source, destination);
		source.forEach(System.out::println);
		    }
		
	}
