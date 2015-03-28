package com.mycompany.myproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyAddServiceClassTest {
	
	MyAddServiceClass myAddServiceClass;

	@Before
	public void setUp() throws Exception {		
		myAddServiceClass = new MyAddServiceClass();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertEquals(2+2, myAddServiceClass.add(2, 2));
		assertEquals(2+3, myAddServiceClass.add(2, 3));
		assertEquals(0+2, myAddServiceClass.add(0, 2));
	}

}
