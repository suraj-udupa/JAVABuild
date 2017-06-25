package com.thinksimple.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.thinksimple.controller.RestController;

import junit.framework.TestCase;

public class TestController {

	
	@Test
	public void PositiveCase() 
	{
	    RestController control = new RestController();
	    
	    assertEquals("Server Response", control.restResponse());
	}
	
	@Test
	public void NegativeCase() 
	{
	    RestController control = new RestController();
	    
	    assertEquals("ServerResponse", control.restResponse());
	}
}
