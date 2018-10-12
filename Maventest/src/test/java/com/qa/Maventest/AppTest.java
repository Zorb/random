package com.qa.Maventest;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testpw() {
		Assert.assertEquals(true, Validator.isValid("gregre"));
	}

}
