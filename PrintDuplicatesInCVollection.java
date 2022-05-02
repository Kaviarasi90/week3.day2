package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInCVollection {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20);
		Set<Integer> set= new HashSet<Integer>(list);
		System.out.println(set);
	}
}
