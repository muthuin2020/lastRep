package main;

import org.testng.annotations.Test;

public class SysGetProprty {

	@Test
	public void sysGetProp() {
		
		System.setProperty("course", "muthuConfig.config");		
		System.out.println("muthu");
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("os.name"));
	    System.out.println(System.getProperty("course"));
	}
	
}
