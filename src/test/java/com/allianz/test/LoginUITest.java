package com.allianz.test;

import org.testng.annotations.Test;

public class LoginUITest {

	@Test(invocationCount = 3)
	public void titleTest() {
		System.out.println("test");
	}
	
	@Test (priority = 1)
	public void applicationTest() {
		System.out.println("apptest");
	}
	}

