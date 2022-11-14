package org.testng;


import org.testng.annotations.Test;

//priority
public class test2 {
	@Test(priority =1)
	private void a() {
		System.out.println("1");

	}
	@Test(priority =3)
	private void b() {
		System.out.println("2");

	}
	@Test(priority =4)
	private void c() {
		System.out.println("3");

	}
	@Test(priority =6)
	private void d() {
		System.out.println("4");

	}

}
