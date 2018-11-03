package com.spring.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // When you have multiple beans of the same time, use @Primary to the important bean
public class QuickSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		
		return numbers;
	}
}
