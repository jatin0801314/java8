package com.java8;

import junit.framework.Assert;
import org.junit.Test;

public class TestApp1 {

	@Test
	public void testPrintHelloWorld() {

		Assert.assertEquals(TestDemo.getHelloWorld(), "Hello World");

	}

}
