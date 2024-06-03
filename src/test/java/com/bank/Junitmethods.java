package com.bank;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bank.junit.TestMethods;

public class Junitmethods {
	
	TestMethods t=new TestMethods();
	
	@Before
	public void print1() {
		System.out.println("Hello");
	}
	
		@Test
		public void testReverse() {
			assertEquals(t.rever(),"ramukmerP");
		}
		
		@Test 
		public void testEqual() {
			assertNotEquals(t.rever(),"Premkumar");
			
		}
		@After
		public void print2() {
			System.out.println("End");
		}
	}


