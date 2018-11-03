package com.spring.demo;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm = null;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] numbers, int searchNum) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		
		System.out.println(sortAlgorithm);
		
		return 3;
	}
}
