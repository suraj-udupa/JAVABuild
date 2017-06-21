package com.thinksimple.test;

import org.junit.Test;

import com.thinksimple.controller.RestController;

import junit.framework.TestCase;

public class TestController extends TestCase {

	
	@Test
	public void testAdd1Plus1() 
	{
	    RestController control = new RestController();
	    
	    assertEquals("Server Response", control.restResponse());
	}
}
