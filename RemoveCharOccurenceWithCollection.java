package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveCharOccurenceWithCollection {
	public static void main(String[] args) {
		
	String sentence = "we learn java basics as part of java sessions in java WEEK1";
	String[] name= {"jk","dd","jk"};
	
	Set<String> set=new HashSet<String>();
	for(String b:name) {
		set.add(b);
	}
	System.out.println(set);
	
	List<String> aslist1=Arrays.asList(sentence);
	for(String d:aslist1) {
		aslist1.add(d);
	
	System.out.println(d);
}}}