import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Project1Test {

	@Test
	public void testLinkedList() {
		ExpressionConverterInterface converter = new InfixToPostfixConverter();
		String testLink = "((A+B)*C/D-E)";
		String expected = "AB+C*D/E-";
		String testLinkresult = converter.convert(testLink);
		System.out.println("Test Result for Linked List: " + testLinkresult);
		assertEquals(expected, testLinkresult);
		// Input: "((A+B)*C/D-E)"
		// Expected Output: AB+C*D/E-
	}

	@Test
	public void testArray() {
		StackInterface testArray = new ArrayStack();
		ExpressionConverterInterface converter = new InfixToPostfixConverter(testArray);
		String testArrayString = "((A+B)*C/D-E)";
		String expected = "AB+C*D/E-";
		String testArrayStringResult = converter.convert(testArrayString);
		System.out.println("Test Result for Array List: " + testArrayStringResult);
		assertEquals(expected, testArrayStringResult);
		// Input: "((A+B)*C/D-E)"
		// Expected Output: AB+C*D/E-
	}

	@Test
	public void testException() {
		ExpressionConverterInterface converter = new InfixToPostfixConverter();
		String test1result = converter.convert("{A+B}");
		System.out.println(test1result);

	}

	/*
	 * @Test public void test3() { ExpressionConverterInterface converter = new
	 * InfixToPostfixConverter(); String test1result =
	 * converter.convert("x ^ y / (E * z) + G"); System.out.println(test1result); }
	 */

	/*
	 * @Test public void test4() { // fail("Not yet implemented"); StackInterface
	 * test4 = new ArrayStack(); ExpressionConverterInterface converter = new
	 * InfixToPostfixConverter(test4); String test1result =
	 * converter.convert("A+B*C"); System.out.println(test1result); }
	 */

	/*
	 * @Test public void test6() { StackInterface test6 = new ArrayStack();
	 * ExpressionConverterInterface converter = new InfixToPostfixConverter(test6);
	 * String test1result = converter.convert("x ^ y / (E * z) + G");
	 * System.out.println(test1result); }
	 */

}
