package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class FindSecondLargest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,2,11,4,6,7);
		
		System.out.println("list"+list);
		
		Collections.sort(list);		
		System.out.println("sorted list"+list);
		System.out.println(list.get(4));
		
	}

}
