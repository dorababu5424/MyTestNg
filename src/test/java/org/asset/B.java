package org.asset;

import org.testng.annotations.Test;

public class B {
	

	@Test(groups="smoke")
	private void tc1()  {
		// TODO Auto-generated method stub
		System.out.println("test case 1");
	}
	
	
	@Test(groups="sanity")
	private void tc3() {
		// TODO Auto-generated method stub
		System.out.println("test case 3");
		
	}
	
	@Test(groups="regression")
	private void tc2() {
		// TODO Auto-generated method stub
		System.out.println("test case 2");
	}
	
	

	@Test(groups="regression")
	private void tc4()  {
		// TODO Auto-generated method stub
		System.out.println("test case 1");
	}
	
	
	@Test(groups="sanity")
	private void tc6() {
		// TODO Auto-generated method stub
		System.out.println("test case 3");
		
	}
	
	@Test(groups="smoke")
	private void tc7() {
		// TODO Auto-generated method stub
		System.out.println("test case 2");
	}
	
	

}
