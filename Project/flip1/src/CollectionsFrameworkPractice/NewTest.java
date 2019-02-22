package CollectionsFrameworkPractice;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  int a=10;
	  int b=10;
	  
	  for(int i=1;i<10;i++)
	  {
		  
		for(int k=1;k<i;k++)  
		{
			System.out.print(" ");
			
		}
		  
		
		for(int j=1;j<b;j++)
		{
		System.out.print(j);	
		a=j;			
		}
		
		b=a;
		
		for(int j=b-1;j>0;j--)
		{
			System.out.print(j);
		}
		
		  
		for(int k=1;k<i;k++)  
		{
			System.out.print(" ");			
		} 
		System.out.print("\n");
		  
	  }
	  
	  
	  
  }
}
