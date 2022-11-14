package org.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	@BeforeTest
	private void a() {
		System.out.println("before test");

	}
	@AfterTest
	private void b() {
		System.out.println("after test");

	}
	@AfterMethod
	private void c() {
		System.out.println("after method");

	}
	@BeforeMethod
	private void d() {
		System.out.println("before method");
		}
	@BeforeClass
	private void e() {
		System.out.println("Before class");

	}
	@AfterClass
	private void i() {
		System.out.println("after class");

	}
	@Test
	private void f() {
		System.out.println("Test");

	}
	@BeforeSuite
	private void g() {
		System.out.println("before suite");

	}
	@AfterSuite
	private void h() {
		System.out.println("after suite");

	}
	
	
	
	
	
	

}
