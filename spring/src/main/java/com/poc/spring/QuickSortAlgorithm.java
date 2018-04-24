/**
 * 
 */
package com.poc.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Kishore
 *
 */
@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
