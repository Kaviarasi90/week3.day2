package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindIntersectionwithCollection {
	public static void main(String[] args) {
		int[] arr= {3,2,11,4,6,7};
		int[] arr1= {1,2,8,4,9,7};
		
		
		Set<Integer> str= new HashSet<Integer>();
		for(Integer d:arr) {
			str.add(d);	
		}
		System.out.println("String 1"+str);
		Set<Integer> str1= new HashSet<Integer>();
		for(Integer e:arr1) {
			str1.add(e);
			
		}
		System.out.println("String 2"+str1);
	str.retainAll(str1);
	System.out.println("Intersection"+str);
	}}
