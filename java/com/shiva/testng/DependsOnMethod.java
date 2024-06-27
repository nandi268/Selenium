package com.shiva.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test
	public void test1() {
		boolean val = false;
//		Assert.assertTrue(val);
		Assert.assertTrue(val, "Failed and it's value false");

	}

	@Test(dependsOnMethods = { "test1" })
	public void test2() {
		System.out.println("Test 2 is passed");
	}

	@Test(dependsOnMethods = { "test1", "test2" })
	public void test3() {
		System.out.println("Test 3 passed");
	}

}
