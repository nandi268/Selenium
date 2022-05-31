package com.shiva.testng3;

import org.testng.annotations.Test;

public class Priority1 {

	@Test(priority=1)
	public void test1() {
		System.out.println("This is test1");
	}

	@Test(priority=2)
	public void test2() {
		System.out.println("This is test2");
	}

	@Test(priority=0)
	public void test3() {

		System.out.println("This is test3");
	}

}
