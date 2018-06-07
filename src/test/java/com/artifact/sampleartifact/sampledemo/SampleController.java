package com.artifact.sampledemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SampleController {

	public static void main(String[] args) {

		SampleController sc = new SampleController();

		Integer[] input = { 1, 2, 3, 4, 5, 9, 11, 12, 13, 15 };

		sc.displayNumSeries(input, input.length);
	}

	private void displayNumSeries(Integer[] input, int length) {
	
		for (int i = 0; i < length; i++) {
			
			if (input[i]+1==input[i+1]) {
				
				System.out.println(input[i]);
			}
			else {
				
			}
			
			
		/*	if (i==input[i]-1) {
			System.out.print(input[i]+"-");
			}
			else{
				System.out.print(","+input[i]);
				if (i==input[i]-1) {
					System.out.print(input[i]+"-");
				}
				
			}*/
		}

	}

}
