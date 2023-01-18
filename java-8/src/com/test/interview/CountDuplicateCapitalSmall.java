package com.test.interview;

import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCapitalSmall {
	
	public static void main(String[] args) {
		String input = "JavaJavaEEe";
		Map < Character, Long > result = input
	            .chars().mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		result.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });
	}

}
