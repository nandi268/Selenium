package com.shiva.testng2;

import org.testng.annotations.Test;

public class Groups {

	
	@Test (groups = "smoke")
	public void test1() {
		System.out.println(" This is smoke test");
	}

	@Test(groups="smoke")
	public void test2() {
		System.out.println(" This is smoke test");
	}

	@Test(groups="regression")
	public void test3() {
		System.out.println(" This is regression test : Today");
	}

}
