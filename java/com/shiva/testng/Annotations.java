package com.shiva.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@Test
	public void test1() {
		System.out.println("First testng script test1");
	}

	@BeforeSuite
	public void test2() {
		System.out.println("This method is @BeforeSuite");
	}

	@BeforeTest
	public void test3() {
		System.out.println("This method is @BeforeTest");
	}

	@BeforeClass
	public void test4() {
		System.out.println("@BeforeClass");
	}

	@BeforeMethod
	public void test5() {
		System.out.println("@BeforeMethod");
	}

	@Test
	public void test6() {
		System.out.println("@Test test2");
	}

	@AfterMethod
	public void test7() {
		System.out.println("@Aftermethod");
	}

	@AfterClass
	public void test8() {
		System.out.println("Afer class");
	}

	@AfterTest
	public void test9() {
		System.out.println("After test");
	}

	@AfterSuite
	public void test10() {
		System.out.println("After suite");
	}

	@Test

	public void test11() {
		System.out.println("Test 11 test3");
	}

}
