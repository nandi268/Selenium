package com.shiva.testng3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {	
	@Test
	public void test1() {		
		boolean val=true;
		Assert.assertTrue(val);
		System.out.println("This is test1");
	}
	@Test(dependsOnMethods = {"test1"}) 
	public void test2() {
		System.out.println("This is test2");
	}
	@Test(dependsOnMethods = {"test1", "test2"})
	public void test3() {

		System.out.println("This is test3");
	}

}
