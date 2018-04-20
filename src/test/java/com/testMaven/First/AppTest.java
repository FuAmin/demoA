package com.testMaven.First;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */


public class AppTest{
	@Test
	public void testSay(){
		App a = new App();
		String content = a.say("hello maven");
		assertEquals("hello maven",content);
		//System.out.println(content);
	}
} 
   