package com.technologyconversations.java8exercises.streams;

import java.awt.print.Printable;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collection;

public class Sum {

	private Sum() {
	}

	// public static int calculate7(List<Integer> numbers) {
	// int total = 0;
	// for (int number : numbers) {
	// total += number;
	// }
	// return total;
	// }

	
//	SOLUTION 1 - uses the REDUCE operation
	public static int calculate(List<Integer> numbers) {

		int sum = numbers.stream()
						 .reduce(0, (x, y) -> x + y);
		return sum;
	}
}

//SOLUTION 2 - uses the SUM operation
//public static int calculate(List<Integer> numbers) {
//	int sumResult = numbers.stream()
//						   .mapToInt(i -> i.intValue())
//					 	    .sum();
//	
//			return sumResult;
//}
//}

// http://www.concretepage.com/java/jdk-8/java-8-stream-reduce-example#list-array-sum