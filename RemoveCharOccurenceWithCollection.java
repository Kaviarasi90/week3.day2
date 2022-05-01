package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveCharOccurenceWithCollection {
	public static void main(String[] args) {
		
	String sentence = "we learn java basics as part of java sessions in java WEEK1";
	String[] name= {"jk","dd","jk"};
	
	List<String> aslist=Arrays.asList(name);
	Set<String> set=new HashSet<String>(aslist);
	System.out.println(set);
	
	List<String> aslist1=Arrays.asList(sentence);
	Set<String> set1=new HashSet<String>(aslist1);
	System.out.println(set1);
	
}}