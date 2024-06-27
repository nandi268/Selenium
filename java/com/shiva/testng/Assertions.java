package com.shiva.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	@Test
	public static void validateBoolean() {
		boolean val = true;
//		Assert.assertTrue(val);
		Assert.assertTrue(val, "Failed and it's value false");
	
	}
	
	@Test
	public static void validateMessage() {
		
		String val1="name";
		String val2="name";		
//		Assert.assertEquals(val1, val2);
		Assert.assertEquals(val1, val2, "Name value is not matched and it's failed");
	}

}
