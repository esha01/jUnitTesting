package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitStrings = new jUnitFunction();
		String result = junitStrings.addStrings("Be Happy"," Always Love Life");
		assertEquals("Be Happy Always Love Life", result);
	}

}
