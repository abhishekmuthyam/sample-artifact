package com.artifact.sampledemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PageSequence {

	public static void main(String[] args) {
		Integer[] input = { 1, 2, 3, 4, 5, 8, 9, 11, 12, 13, 21, 22, 23, 25, 26, 27 };
		int consecutiveIncrement = 0;
		List<Integer> numList = Arrays.asList(input);
		ArrayList<String> consecutiveSegment = new ArrayList<>();
		ArrayList<String> finalList = new ArrayList<>();
		for (Integer integer : numList) {
			if (consecutiveIncrement == 0) {
				consecutiveSegment.add(integer.toString());
				consecutiveIncrement = integer;
				consecutiveIncrement++;
			} else {
				int size = consecutiveSegment.size();
				if (consecutiveIncrement == integer) {
					consecutiveSegment.add(integer.toString());
					consecutiveIncrement++;
				} else if (consecutiveIncrement != integer) {
					boolean threeSeqNo = false;
					boolean twoSeqNo = false;
					if (size >= 3) {
						finalList.add(consecutiveSegment.get(0) + "-" + consecutiveSegment.get(size - 1));
						consecutiveSegment.clear();
						consecutiveSegment.add(integer.toString());
						threeSeqNo = true;
						consecutiveIncrement = integer;
						consecutiveIncrement++;
					} else if (size == 2) {
						finalList.add(consecutiveSegment.get(0).toString());
						finalList.add(consecutiveSegment.get(1).toString());
						consecutiveSegment.clear();
						consecutiveSegment.add(integer.toString());
						consecutiveIncrement = integer;
						consecutiveIncrement++;
						twoSeqNo = true;

					} else if (size != 1) {
						finalList.add(integer.toString());
					}
					if (size == 1) {
						finalList.add(consecutiveSegment.get(0).toString());
						consecutiveSegment.add(integer.toString());
					}
					if (!twoSeqNo && !threeSeqNo) {
						consecutiveSegment.clear();
						consecutiveIncrement = 0;
					}
				}
			}
		}
		if (!consecutiveSegment.isEmpty()) {
			if (consecutiveSegment.size() >= 3) {
				finalList.add(consecutiveSegment.get(0) + "-" + consecutiveSegment.get(consecutiveSegment.size() - 1));
			} else {
				finalList.addAll(consecutiveSegment);
			}
		}
		finalList.toArray();
		System.out.println(finalList);
	}
}
