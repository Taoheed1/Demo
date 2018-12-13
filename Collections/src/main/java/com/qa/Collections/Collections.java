package com.qa.Collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		System.out.println(arrayHundred());
	}

	public static int[] arrayHundred() {

		int[] intArray = new int[100];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
			System.out.println(intArray[i]);
		}
		return intArray;

	}

	public static void listHundred999() {

		List<Integer>hundred999 = new ArrayList<Integer>();
		
	}

	// private static void arrayHundred() {
	// // TODO Auto-generated method stub
	//
	// }
}
int [] array = new int[12]; 

List<Integer> number = new ArrayList<Integer>(); 

number.add(6); 

 

for (int i=100; i<1000; i++) { 

    //number.add(i); 

    number.add(i*10); 

} 



for (int i=0; i<10; i++) { 

    (number(i)= number(i) * 10); 

} 

 

//Makes an array list 

List<Integer> times10 = new ArrayList<Integer>(); 

List<Integer>times10 = times10.stream().map(n-> {return n*10;    }).collect(collectors.to.list());