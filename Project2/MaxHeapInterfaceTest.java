/**
 * CS2400.02 
 * Project #2 
 * Cal Poly Pomona 
 * Dominick Atanasio
 * 
 * @author Parayao_K
 *
 */
public class MaxHeapInterfaceTest {

	public static void main(String[] args) {
		try {
			testForArrayMaxHeapAddInteger();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForArrayMaxHeapAddInteger Error: Not expected value.");
		}
		divideSpace();
		try {
			testForArrayMaxHeapAddInteger();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForArrayMaxHeapAddInteger Error: Not expected value.");
		}
		divideSpace();
		try {
			testForMaxHeapPriorityQueueAddInteger();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForMaxHeapPriorityQueueAddInteger Error: Not expected value.");
		}
		divideSpace();
		try {
			testForArrayMaxHeapRemoveInteger();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForArrayMaxHeapRemoveInteger Error: Removal not correctly implemented.");
		}
		divideSpace();
		try {
			testForPriorityQueueHeapRemoveInteger();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForPriorityQueueHeapRemoveInteger Error: Removal not correctly implemented.");
		}
		divideSpace();
		try {
			testForArrayMaxHeapGetInteger();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForArrayMaxHeapGetInteger Error: Max Integer not correctly retrieved.");
		}
		divideSpace();
		try {
			testForMaxHeapPriorityQueuePeek();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForMaxHeapPriorityQueuePeek Error: Top element is not found.");
		}
		divideSpace();
		try {
			testForIsEmptyAndClear();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.err.println("testForIsEmptyAndClear Error: Array is not empty.");
		}
		divideSpace();
		try {
			testForConstructor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForConstructor Error: Root node is not the same.");
		}
		divideSpace();
		try {
			testForConstructorAccuracy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForConstructorAccuracy Error: Root node is not the same.");
		}
		divideSpace();
		try {
			testForAddDouble();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForAddDouble Error: Add was not implemented correctly.");
		}
		divideSpace();
		try {
			testForAddFloat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForAddFloat Error: Add was not implemented correctly.");
		}
		divideSpace();
		try {
			testForAddNegatives();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForAddNegatives Error: Add was not implemented correctly.");
		}
		divideSpace();
		try {
			testForAddZeros();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForAddZeros Error: Add was not implemented correctly.");
		}
		divideSpace();
		try {
			testForMaxCapacity();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("testForMaxCapacity Error: Max capacity fail");
		}
	}

	/**
	 * Method to create space for ease of readability.
	 */
	private static void divideSpace() {
		System.out.println("------------------------");
	}

	/**
	 * Tests the add method for the ArrayMaxHeap.
	 * 
	 * @throws Exception if the result is not expected.
	 */
	private static void testForArrayMaxHeapAddInteger() throws Exception {
		MaxHeapInterface<Integer> testAddInteger = new ArrayMaxHeap<>();
		Integer a = 40;
		Integer b = 50;
		Integer c = 20;
		Integer d = 10;
		Integer e = 30;
		Integer f = 60;
		Integer g = 80;
		Integer h = 90;
		Integer i = 70;
		Integer j = 85;

		testAddInteger.add(a);
		testAddInteger.add(b);
		testAddInteger.add(c);
		testAddInteger.add(d);
		testAddInteger.add(e);
		testAddInteger.add(f);
		testAddInteger.add(g);
		testAddInteger.add(h);
		testAddInteger.add(i);
		testAddInteger.add(j);

		int testSize = testAddInteger.getSize();
		int expectedSize = 10;

		if (testSize != expectedSize) {
			throw new Exception();
		} else {
			System.out.println("The size is expected");
		}

	}

	/**
	 * Tests the add method for the MaxHeapPriorityQueue.
	 * 
	 * @throws Exception if the result is not expected.
	 */
	private static void testForMaxHeapPriorityQueueAddInteger() throws Exception {
		PriorityQueueInterface<Integer> testAddInteger = new MaxHeapPriorityQueue<>();
		Integer a = 40;
		Integer b = 50;
		Integer c = 20;
		Integer d = 10;
		Integer e = 30;
		Integer f = 60;
		Integer g = 80;
		Integer h = 90;
		Integer i = 70;
		Integer j = 85;

		testAddInteger.add(a);
		testAddInteger.add(b);
		testAddInteger.add(c);
		testAddInteger.add(d);
		testAddInteger.add(e);
		testAddInteger.add(f);
		testAddInteger.add(g);
		testAddInteger.add(h);
		testAddInteger.add(i);
		testAddInteger.add(j);

		int testSize = testAddInteger.getSize();
		int expectedSize = 10;

		if (testSize != expectedSize) {
			throw new Exception();
		} else {
			System.out.println("The size is expected");
		}

	}

	/**
	 * Tests the removeMax method for ArrayMaxHeap.
	 * 
	 * @throws Exception if the result is not expected.
	 */
	private static void testForArrayMaxHeapRemoveInteger() throws Exception {
		MaxHeapInterface<Integer> testRemoveInteger = new ArrayMaxHeap<>();
		Integer a = 40;
		Integer b = 50;
		Integer c = 20;
		Integer d = 10;
		Integer e = 30;
		Integer f = 60;
		Integer g = 80;
		Integer h = 90;
		Integer i = 70;
		Integer j = 85;

		testRemoveInteger.add(a);
		testRemoveInteger.add(b);
		testRemoveInteger.add(c);
		testRemoveInteger.add(d);
		testRemoveInteger.add(e);
		testRemoveInteger.add(f);
		testRemoveInteger.add(g);
		testRemoveInteger.add(h);
		testRemoveInteger.add(i);
		testRemoveInteger.add(j);

		int testSize = testRemoveInteger.getSize();
		int expectedSize = 10;

		if (testSize != expectedSize) {
			throw new Exception();
		} else {
			System.out.println("The current max is: " + testRemoveInteger.getMax());
		}

		testRemoveInteger.removeMax();
		testRemoveInteger.removeMax();

		testSize = testRemoveInteger.getSize();
		int newExpectedSize = 8;

		if (testSize != newExpectedSize) {
			throw new Exception();
		} else {
			System.out.println("After removal, the current max is: " + testRemoveInteger.getMax());
		}
	}

	/**
	 * Tests the remove method for MaxHeapPriorityQueue.
	 * 
	 * @throws Exception if the result is not expected.
	 */
	private static void testForPriorityQueueHeapRemoveInteger() throws Exception {
		PriorityQueueInterface<Integer> testRemoveInteger = new MaxHeapPriorityQueue<>();
		Integer a = 40;
		Integer b = 50;
		Integer c = 20;
		Integer d = 10;
		Integer e = 30;
		Integer f = 60;
		Integer g = 80;
		Integer h = 90;
		Integer i = 70;
		Integer j = 85;

		testRemoveInteger.add(a);
		testRemoveInteger.add(b);
		testRemoveInteger.add(c);
		testRemoveInteger.add(d);
		testRemoveInteger.add(e);
		testRemoveInteger.add(f);
		testRemoveInteger.add(g);
		testRemoveInteger.add(h);
		testRemoveInteger.add(i);
		testRemoveInteger.add(j);

		int testSize = testRemoveInteger.getSize();
		int expectedSize = 10;

		if (testSize != expectedSize) {
			throw new Exception();
		} else {
			System.out.println("The current max is: " + testRemoveInteger.peek());
		}

		testRemoveInteger.remove();
		testRemoveInteger.remove();

		testSize = testRemoveInteger.getSize();
		int newExpectedSize = 8;

		if (testSize != newExpectedSize) {
			throw new Exception();
		} else {
			System.out.println("After removal, the current max is: " + testRemoveInteger.peek());
		}
	}

	/**
	 * Tests the getMax method for ArrayMaxHeap.
	 * 
	 * @throws Exception if the result is not expected.
	 */
	private static void testForArrayMaxHeapGetInteger() throws Exception {
		MaxHeapInterface<Integer> testGetInteger = new ArrayMaxHeap<>();
		Integer a = 40;
		Integer b = 50;
		Integer c = 20;
		Integer d = 10;
		Integer e = 30;
		Integer f = 60;
		Integer g = 80;
		Integer expectedMaxValue = 90;
		Integer i = 70;
		Integer j = 85;

		testGetInteger.add(a);
		testGetInteger.add(b);
		testGetInteger.add(c);
		testGetInteger.add(d);
		testGetInteger.add(e);
		testGetInteger.add(f);
		testGetInteger.add(g);
		testGetInteger.add(expectedMaxValue);
		testGetInteger.add(i);
		testGetInteger.add(j);

		Integer testMaxValue = testGetInteger.getMax();
		// Integer expectedMaxValue = 90;

		if (testMaxValue.compareTo(expectedMaxValue) != 0) {
			throw new Exception();
		} else {
			System.out.println("The current max is: " + testMaxValue);
		}
	}

	/**
	 * Tests the peek method for MaxHeapPriorityQueue.
	 * 
	 * @throws Exception if the result is not expected.
	 */
	private static void testForMaxHeapPriorityQueuePeek() throws Exception {
		PriorityQueueInterface<Integer> testPeek = new MaxHeapPriorityQueue<>();
		Integer a = 40;
		Integer b = 50;
		Integer c = 20;
		Integer d = 10;
		Integer e = 30;
		Integer f = 60;
		Integer g = 80;
		Integer expectedValue = 90;
		Integer i = 70;
		Integer j = 85;

		testPeek.add(a);
		testPeek.add(b);
		testPeek.add(c);
		testPeek.add(d);
		testPeek.add(e);
		testPeek.add(f);
		testPeek.add(g);
		testPeek.add(expectedValue);
		testPeek.add(i);
		testPeek.add(j);

		Integer testPeekValue = testPeek.peek();
		// Integer expectedValue = 10;

		if (testPeekValue.compareTo(expectedValue) != 0) {
			throw new Exception();
		} else {
			System.out.println("The current max is: " + testPeekValue);
		}
	}

	/**
	 * Tests the isEmpty method and the clear method for ArrayMaxHeap and
	 * MaxHeapPriorityQueue.
	 */
	private static void testForIsEmptyAndClear() throws Exception {
		MaxHeapInterface<Integer> testAMHIsEmpty = new ArrayMaxHeap<>();
		PriorityQueueInterface<Integer> testMHPQIsEmpty = new MaxHeapPriorityQueue<>();

		Integer a = 40;
		Integer b = 50;
		Integer c = 20;
		Integer d = 10;
		Integer e = 30;
		Integer f = 60;
		Integer g = 80;
		Integer h = 90;
		Integer i = 70;
		Integer j = 85;

		testAMHIsEmpty.add(a);
		testAMHIsEmpty.add(b);
		testAMHIsEmpty.add(c);
		testAMHIsEmpty.add(d);
		testAMHIsEmpty.add(e);
		testAMHIsEmpty.add(f);
		testAMHIsEmpty.add(g);
		testAMHIsEmpty.add(h);
		testAMHIsEmpty.add(i);
		testAMHIsEmpty.add(j);

		testMHPQIsEmpty.add(a);
		testMHPQIsEmpty.add(b);
		testMHPQIsEmpty.add(c);
		testMHPQIsEmpty.add(d);
		testMHPQIsEmpty.add(e);
		testMHPQIsEmpty.add(f);
		testMHPQIsEmpty.add(g);
		testMHPQIsEmpty.add(h);
		testMHPQIsEmpty.add(i);
		testMHPQIsEmpty.add(j);

		boolean isEmpty1 = testAMHIsEmpty.isEmpty();
		boolean isEmpty2 = testMHPQIsEmpty.isEmpty();

		if (isEmpty1 || isEmpty2) {
			System.err.println("test1 fail");
			throw new Exception();
		} else {
			System.out.println("The testAMHIsEmpty array is empty?" + testAMHIsEmpty.isEmpty());
			System.out.println("The testMHPQIsEmpty array is empty?" + testMHPQIsEmpty.isEmpty());
		}

		testAMHIsEmpty.clear();
		testMHPQIsEmpty.clear();

		isEmpty1 = testAMHIsEmpty.isEmpty();
		isEmpty2 = testMHPQIsEmpty.isEmpty();

		if (!isEmpty1 || !isEmpty2) {
			System.err.println("test2 fail");
			throw new Exception();
		} else {
			System.out.println("The testAMHIsEmpty array is empty?" + testAMHIsEmpty.isEmpty());
			System.out.println("The testMHPQIsEmpty array is empty?" + testMHPQIsEmpty.isEmpty());
		}

		testAMHIsEmpty.add(a);
		testAMHIsEmpty.add(b);
		testAMHIsEmpty.add(c);

		testMHPQIsEmpty.add(a);
		testMHPQIsEmpty.add(b);

		isEmpty1 = testAMHIsEmpty.isEmpty();
		isEmpty2 = testMHPQIsEmpty.isEmpty();

		if (isEmpty1 || isEmpty2) {
			System.err.println("test3 fail");
			throw new Exception();
		} else {
			System.out.println("The testAMHIsEmpty array is empty?" + testAMHIsEmpty.isEmpty());
			System.out.println("The testMHPQIsEmpty array is empty?" + testMHPQIsEmpty.isEmpty());
		}

	}

	/**
	 * Tests array constructor, retrieves initial root node, removes root node
	 * twice, returns the root node.
	 * 
	 * @throws Exception if the root node of the ArrayMaxHeap and the
	 *                   MaxHeapPriorityQueue classes are not the same.
	 */
	private static void testForConstructor() throws Exception {
		MaxHeapInterface<Integer> testMaxHeapConstructor;
		PriorityQueueInterface<Integer> testPriorityQueueConstructor;

		Integer a = 40;
		Integer b = 50;
		Integer c = 20;
		Integer d = 10;
		Integer e = 30;
		Integer f = 60;
		Integer expectedRootAfterRemove = 80;
		Integer expectedRoot = 90;
		Integer i = 85;
		Integer j = 70;

		Integer[] array = { a, b, c, d, e, f, expectedRootAfterRemove, expectedRoot, j, i };

		testMaxHeapConstructor = new ArrayMaxHeap(array);
		testPriorityQueueConstructor = new MaxHeapPriorityQueue(array);

		Integer currentMax = testMaxHeapConstructor.getMax();
		Integer currentTop = testPriorityQueueConstructor.peek();
		testMaxHeapConstructor.removeMax();
		testMaxHeapConstructor.removeMax();
		testPriorityQueueConstructor.remove();
		testPriorityQueueConstructor.remove();

		if (currentMax.compareTo(expectedRoot) != 0 && currentTop.compareTo(expectedRoot) != 0) {
			throw new Exception();
		} else {
			System.out.println("The roots are the same");
		}

		Integer currentMaxAfterRemove = testMaxHeapConstructor.getMax();
		Integer currentTopAfterRemove = testPriorityQueueConstructor.peek();

		if (currentMaxAfterRemove.compareTo(expectedRootAfterRemove) != 0
				&& currentTopAfterRemove.compareTo(expectedRootAfterRemove) != 0) {
			throw new Exception();
		} else {
			System.out.println("The roots are the same");
		}

	}

	/**
	 * Checks if the testForConstructor is accurate by manually adding the Integer
	 * objects.
	 * 
	 * @throws Exception if the root node of the ArrayMaxHeap and the
	 *                   MaxHeapPriorityQueue classes are not the same.
	 */
	private static void testForConstructorAccuracy() throws Exception {
		MaxHeapInterface<Integer> testMaxHeapConstructorAccuracy = new ArrayMaxHeap<>();
		PriorityQueueInterface<Integer> testPriorityQueueConstructorAccuracy = new MaxHeapPriorityQueue<>();

		Integer a = 40;
		Integer b = 50;
		Integer c = 20;
		Integer d = 10;
		Integer e = 30;
		Integer f = 60;
		Integer expectedRootAfterRemove = 80;
		Integer expectedRoot = 90;
		Integer i = 85;
		Integer j = 70;

		testMaxHeapConstructorAccuracy.add(a);
		testMaxHeapConstructorAccuracy.add(b);
		testMaxHeapConstructorAccuracy.add(c);
		testMaxHeapConstructorAccuracy.add(d);
		testMaxHeapConstructorAccuracy.add(e);
		testMaxHeapConstructorAccuracy.add(f);
		testMaxHeapConstructorAccuracy.add(expectedRootAfterRemove);
		testMaxHeapConstructorAccuracy.add(expectedRoot);
		testMaxHeapConstructorAccuracy.add(i);
		testMaxHeapConstructorAccuracy.add(j);

		testPriorityQueueConstructorAccuracy.add(a);
		testPriorityQueueConstructorAccuracy.add(b);
		testPriorityQueueConstructorAccuracy.add(c);
		testPriorityQueueConstructorAccuracy.add(d);
		testPriorityQueueConstructorAccuracy.add(e);
		testPriorityQueueConstructorAccuracy.add(f);
		testPriorityQueueConstructorAccuracy.add(expectedRootAfterRemove);
		testPriorityQueueConstructorAccuracy.add(expectedRoot);
		testPriorityQueueConstructorAccuracy.add(i);
		testPriorityQueueConstructorAccuracy.add(j);

		Integer currentMax = testMaxHeapConstructorAccuracy.getMax();
		Integer currentTop = testPriorityQueueConstructorAccuracy.peek();
		testMaxHeapConstructorAccuracy.removeMax();
		testMaxHeapConstructorAccuracy.removeMax();
		testPriorityQueueConstructorAccuracy.remove();
		testPriorityQueueConstructorAccuracy.remove();

		if (currentMax.compareTo(expectedRoot) != 0 && currentTop.compareTo(expectedRoot) != 0) {
			throw new Exception();
		} else {
			System.out.println("The roots are the same");
		}

		Integer currentMaxAfterRemove = testMaxHeapConstructorAccuracy.getMax();
		Integer currentTopAfterRemove = testPriorityQueueConstructorAccuracy.peek();

		if (currentMaxAfterRemove.compareTo(expectedRootAfterRemove) != 0
				&& currentTopAfterRemove.compareTo(expectedRootAfterRemove) != 0) {
			throw new Exception();
		} else {
			System.out.println("The roots are the same");
		}

	}

	/**
	 * Tests add method for doubles.
	 */
	private static void testForAddDouble() throws Exception {
		Double a = 52.5;
		Double b = 66.6;
		Double c = 78.8;
		Double d = 42.42;
		Double e = 45.46;

		MaxHeapInterface<Double> test1Double = new ArrayMaxHeap<>();
		PriorityQueueInterface<Double> test2Double = new MaxHeapPriorityQueue<>();

		test1Double.add(a);
		test2Double.add(a);

		test1Double.add(b);
		test1Double.add(c);
		test1Double.add(d);
		test1Double.add(e);

		test2Double.add(b);
		test2Double.add(c);
		test2Double.add(d);
		test2Double.add(e);

		int test1Size = test1Double.getSize();
		int test2Size = test2Double.getSize();
		int expectedSize = 5;

		if (test1Size != expectedSize && test2Size != expectedSize) {
			throw new Exception();
		} else {
			System.out.println("The size is expected");
		}
	}

	/**
	 * Tests add method for float values.
	 */
	private static void testForAddFloat() throws Exception {
		Float a = 52.524f;
		Float b = 52.524f;
		Float c = 52.524f;
		Float d = 52.524f;
		Float e = 52.524f;

		MaxHeapInterface<Float> test1Float = new ArrayMaxHeap<>();
		PriorityQueueInterface<Float> test2Float = new MaxHeapPriorityQueue<>();

		test1Float.add(a);
		test2Float.add(a);

		test1Float.add(b);
		test1Float.add(c);
		test1Float.add(d);
		test1Float.add(e);

		test2Float.add(b);
		test2Float.add(c);
		test2Float.add(d);
		test2Float.add(e);

		int test1Size = test1Float.getSize();
		int test2Size = test1Float.getSize();
		int expectedSize = 5;

		if (test1Size != expectedSize && test2Size != expectedSize) {
			throw new Exception();
		} else {
			System.out.println("The size is expected");
		}
	}

	/**
	 * Tests add method for negative integers.
	 */
	private static void testForAddNegatives() throws Exception {
		Integer a = -55;
		Integer b = -33;
		Integer c = -45;
		Integer expectedMax = -21;
		Integer e = -69;

		MaxHeapInterface<Integer> test1NegativeInteger = new ArrayMaxHeap<>();
		PriorityQueueInterface<Integer> test2NegativeInteger = new MaxHeapPriorityQueue<>();

		test1NegativeInteger.add(a);
		test2NegativeInteger.add(a);

		test1NegativeInteger.add(b);
		test1NegativeInteger.add(c);
		test1NegativeInteger.add(expectedMax);
		test1NegativeInteger.add(e);

		test2NegativeInteger.add(b);
		test2NegativeInteger.add(c);
		test2NegativeInteger.add(expectedMax);
		test2NegativeInteger.add(e);

		int test1Size = test1NegativeInteger.getSize();
		int test2Size = test2NegativeInteger.getSize();
		int expectedSize = 5;

		if (test1Size != expectedSize && test2Size != expectedSize) {
			throw new Exception();
		} else {
			System.out.println("The size is expected");
		}

		Integer test1Max = test1NegativeInteger.getMax();
		Integer test2Max = test2NegativeInteger.peek();

		if (test1Max.compareTo(expectedMax) != 0 && test2Max.compareTo(expectedMax) != 0) {
			System.err.println("negative test fail");
			throw new Exception();
		} else {
			System.out.println("The current max is: " + test1Max);
		}

	}

	/**
	 * Tests for all zero values.
	 * @throws Exception if zeroes were not added properly.
	 */
	private static void testForAddZeros() throws Exception {
		Float a = 0.0f;
		Float b = 0.0f;
		Float c = 0.0f;
		Float d = 0.0f;
		Float e = 0.0f;

		MaxHeapInterface<Float> test1Float;
		PriorityQueueInterface<Float> test2Float;

		Float[] arrayOfZeroes = { a, b, c, d, e };

		test1Float = new ArrayMaxHeap(arrayOfZeroes);
		test2Float = new MaxHeapPriorityQueue(arrayOfZeroes);

		int test1Size = test1Float.getSize();
		int test2Size = test1Float.getSize();
		int expectedSize = 5;

		if (test1Size != expectedSize && test2Size != expectedSize) {
			throw new Exception();
		} else {
			System.out.println("The size is expected");
		}

		Float test1FloatGetMax = test1Float.getMax();
		Float test2FloatPeek = test2Float.peek();

		if (test1FloatGetMax.compareTo(a) != 0 && test2FloatPeek.compareTo(a) != 0) {
			throw new Exception();
		} else {
			System.out.println("Top value is: " + test2FloatPeek);
		}
	}

	/**
	 * Test for the max capacity of the array.
	 * @throws Exception if the array exceeds the max capacity.
	 */
	private static void testForMaxCapacity() throws Exception {
		MaxHeapInterface<Integer> test1MaxCapacity = new ArrayMaxHeap(5);
		boolean isMax = false;

		try {
			for (int i = 0; i < 10001; i++) {
				test1MaxCapacity.add(new Integer(i));
			}
		} catch (Exception e) {
			System.out.println("Expected exception from max capacity.");
			isMax = true;
		}

		if (!isMax) {
			throw new Exception();
		}
	}

}