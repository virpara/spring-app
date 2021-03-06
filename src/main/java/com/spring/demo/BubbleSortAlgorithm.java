package com.spring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// if you have multiple means of the same type, it doesn't work. To make it work, 
// consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, 
// or using @Qualifier to identify the bean that should be consumed
@Qualifier("bubble")
//@Primary
@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		
		return numbers;
	}
}
