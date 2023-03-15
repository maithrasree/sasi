package org.Sample;

import org.junit.Ignore;
import org.junit.Test;

public class A {
	@Ignore
	@Test
	public void tc1() {
		System.out.println("Test Case =1");
}
	
	@Test
	public void tc2() {
		System.out.println("Test Case =2");
	}
	
	@Test
	public void tc3() {
		System.out.println("Test Case =3");
	}
	

}
