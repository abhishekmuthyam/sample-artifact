package com.boeing.sampledemo.controller;

import java.util.HashMap;
import java.util.Map;

public class Samplecontroller {

	public static void main(String[] args) {

		Samplecontroller sc = new Samplecontroller();

		int[] input = { 1, 2, 3, 4, 5, 9, 11, 12, 13, 15 };

		sc.displayNumSeries(input, input.length);
	}

	private void displayNumSeries(int[] input, int length) {

		Map<Integer, Integer> list = new HashMap<Integer, Integer>();

		for (int i = 0; i < length; i++) {

			if (list.containsKey(input[i])) {
				System.out.println(i);

			}
		}

	}

}
