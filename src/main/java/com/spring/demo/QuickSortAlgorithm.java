package com.spring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // When you have multiple beans of the same type, use @Primary to the important bean. @Qualifier acts as @Primary, when there are multiple beans of the same type, but only one of them is anotated with Qualifier
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		
		return numbers;
	}
}
