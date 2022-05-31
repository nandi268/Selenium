package com.shiva.testng;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=0)
	public void test3() {
		System.out.println("This is test3");
	}

	@Test(priority=1)
	public void test2() {
		System.out.println("This is test2");
	}

	@Test(priority=8)
	public void test4() {
		System.out.println("This is test4");
	}

	@Test(priority=1)
	public void test1() {
		System.out.println("This is test1");
	}
	
	@Test(enabled=false)
	public void test5() {
		System.out.println("This is test5");
	}

}
