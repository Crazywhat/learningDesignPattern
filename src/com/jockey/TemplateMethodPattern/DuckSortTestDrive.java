package com.jockey.TemplateMethodPattern;

import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		Duck[] ducks = {
				new Duck("A", 8),
				new Duck("B", 2),
				new Duck("C", 7),
				new Duck("D", 2),
				new Duck("E", 10),
				new Duck("F", 2)
		};
		
		System.out.println("Before sorting :");
		System.out.println(Arrays.toString(ducks));
		
		MyArrays.sort(ducks);
		
		System.out.println("After sorting :");
		System.out.println(Arrays.toString(ducks));
		
	}

}
