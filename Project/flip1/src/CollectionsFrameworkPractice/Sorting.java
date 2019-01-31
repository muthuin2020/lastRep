package CollectionsFrameworkPractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sorting {
	
	public static void main(String args[]) {
	
	List<String> s1=new LinkedList<>();	
		s1.add("Muthu");
		s1.add("Raina");
		s1.add("Sachin");
		s1.add("Raina");
		s1.add("Yuvi");
		s1.add("Raina");		
		System.out.println(s1);
		
		 String[] ar1= {"sachin","muthu","raina","ABD","Dhoni"};
		 
		 for(String a1:ar1)
		 System.out.println(a1);
		
		//Arrays.sort(s1, String.CASE_INSENSITIVE_ORDER);
		Arrays.sort(ar1);
		
		
		for(String a1:ar1)
		System.out.println(a1);
		
		System.out.println("Enter an INteger");
		Scanner sc=new Scanner(System.in);	
		
		String a2=sc.nextLine();
		System.out.println(a2);
		
		System.out.println(Math.sqrt(28));
		
		
	}

}
