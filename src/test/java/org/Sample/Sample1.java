package org.Sample;

import org.baseclass.UtilClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample1 extends UtilClass {
	//Junit
		
@BeforeClass
public static void bc() {
	System.out.println("Before Class Method");
}
@Before
public void before() {
	System.out.println("Before");
}
@AfterClass
public static void ac() {
	System.out.println("After Class Method");
}
@After
public void after() {

System.out.println("After");
}
@Test
public void tc1() {

System.out.println("Test 1");
}
@Test
public void tc2() {
	System.out.println("Test 2");
}
@Test
public void tc3() {
System.out.println("Test 3");
}
}


