package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	// without constructor or setter injection
	@Autowired
	private SortAlgorithm sortAlgorithm = null;
	
	public int binarySearch(int[] numbers, int searchNum) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		
		System.out.println(sortAlgorithm);
		
		return 3;
	}

}
