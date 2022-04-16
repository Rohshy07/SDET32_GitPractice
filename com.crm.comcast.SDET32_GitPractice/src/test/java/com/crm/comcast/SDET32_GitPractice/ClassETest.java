package com.crm.comcast.SDET32_GitPractice;

import org.testng.annotations.Test;

public class ClassETest {
	@Test
	public void demotest() {
		
		String browser= System.getProperty("browser");
		String url= System.getProperty("url");
		
		System.out.println(browser);
		System.out.println(url);
		
		System.out.println("First Push");
		System.out.println("First changed ");
		System.out.println("Second changed ");
	}
	}