package week3.day2;


public class RemoveCount {
	public static void main(String[] args) {
		
	String sentence = "we learn java basics as part of java sessions in java WEEK1";
	String[] arr=sentence.split(" ");
	int count=0;
	for (int i = 0; i < arr.length; i++) {				
			for (int j = i+1; j < arr.length; j++) {
					if(arr[i].equalsIgnoreCase(arr[j])) {
					arr[j]="";
					count++;
					}
			}
		}
	if(count>1) 
	for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[k]+" ");
		
	}}}