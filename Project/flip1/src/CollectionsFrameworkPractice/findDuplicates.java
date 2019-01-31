package CollectionsFrameworkPractice;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class findDuplicates {

	public static void main(String[] args) {
		
	List<String> s1=new LinkedList<>();
	
	s1.add("Muthu");
	s1.add("Raina");
	s1.add("Sachin");
	s1.add("Raina");
	s1.add("Yuvi");
	s1.add("Raina");
		
	System.out.println(s1);
	
	Set<String> st=new HashSet<>();
	
	for(int i=0;i<s1.size();i++) {
	  if(!st.add(s1.get(i))) {
	  System.out.println(s1.get(i)+" is a duplicate, so removed");	
	  s1.remove(i);
	}
	}
	System.out.println(s1);
	}
	}