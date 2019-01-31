package CollectionsFrameworkPractice;

import org.testng.annotations.Test;

public class RemoveDuplivcates_In_LinkedList {
  @Test
  public void duplicates_Remove() { 
	  	  
java.util.LinkedList<Object> s1=new java.util.LinkedList<>();

s1.add("Muthu");
s1.add("Raina");
s1.add("Sachin");
s1.add(11);
s1.add(88);
System.out.println(s1);
int a1=(int) s1.get(3);
System.out.println(a1);
if (a1==11)
	System.out.println("Equals");

//Set<String> s2=new HashSet<>(s1);

//System.out.println(s2);

 //s1=new java.util.LinkedList<>(s2);
System.out.println(s1);

  
  }
}
