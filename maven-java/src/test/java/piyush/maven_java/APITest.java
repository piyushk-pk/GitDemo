package piyush.maven_java;

import org.testng.annotations.Test;

// Maven can only recognise the test classes if it ends with the word "Test" to execute it in command prompt.

public class APITest {

	@Test
	public void restAPI() {
		System.out.println("restAPI");
	}
	
	@Test
	public void APIonMobile() {
		System.out.println("APIonMobile");
	}
}
