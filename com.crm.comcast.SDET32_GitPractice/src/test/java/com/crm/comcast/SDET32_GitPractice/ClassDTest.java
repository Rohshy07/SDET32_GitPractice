package com.crm.comcast.SDET32_GitPractice;

import org.testng.annotations.Test;

public class ClassDTest {
@Test
public void demotest() {
	
	String browser= System.getProperty("browser");
	String url= System.getProperty("url");
	
	System.out.println(browser);
	System.out.println(url);
	
	System.out.println("First Push");
	System.out.println("First changed push for jenkins");
	System.out.println("Second changed push for jenkins2");
}
}
