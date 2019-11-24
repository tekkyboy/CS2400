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
		testForAddInteger();
		divideSpace();
		testForAddDouble();
		divideSpace();
		testForAddFloat();
		divideSpace();
		testForAddNegatives();
		divideSpace();
		testForIsEmptyAndIsClear();
		divideSpace();
		testForValues();
		divideSpace();
		testForConstructor();
		divideSpace();
		testForRemoveRootNode();
	}

	/**
	 * Tests add method for integers.
	 */
	private static void testForAddInteger() {
		int a = 55;
		int b = 33;
		int c = 45;
		int d = 21;
		int e = 69;

		MaxHeapInterface<Integer> test1Integer = new ArrayMaxHeap<>();
		PriorityQueueInterface<Integer> test2Integer = new MaxHeapPriorityQueue<>();

		test1Integer.add(a);
		test2Integer.add(a);

		System.out.println("The size of the test1Integer array is: " + test1Integer.getSize());
		System.out.println("The size of the test2Integer array is: " + test2Integer.getSize());

		test1Integer.add(b);
		test1Integer.add(c);
		test1Integer.add(d);
		test1Integer.add(e);

		test2Integer.add(b);
		test2Integer.add(c);
		test2Integer.add(d);
		test2Integer.add(e);

		System.out.println("The size of the test1Integer array is: " + test1Integer.getSize());
		System.out.println("The size of the test2Integer array is: " + test2Integer.getSize());

	}

	/**
	 * Method to create space for ease of readability
	 */
	private static void divideSpace() {
		System.out.println("------------------------");
	}

	/**
	 * Tests add method for doubles.
	 */
	private static void testForAddDouble() {
		double a = 52.5;
		double b = 66.6;
		double c = 78.8;
		double d = 42.42;
		double e = 45.46;

		MaxHeapInterface<Double> test1Double = new ArrayMaxHeap<>();
		PriorityQueueInterface<Double> test2Double = new MaxHeapPriorityQueue<>();

		test1Double.add(a);
		test2Double.add(a);

		System.out.println("The size of the test1Double array is: " + test1Double.getSize());
		System.out.println("The size of the test2Double array is: " + test2Double.getSize());

		test1Double.add(b);
		test1Double.add(c);
		test1Double.add(d);
		test1Double.add(e);

		test2Double.add(b);
		test2Double.add(c);
		test2Double.add(d);
		test2Double.add(e);

		System.out.println("The size of the test1Double array is: " + test1Double.getSize());
		System.out.println("The size of the test2Double array is: " + test2Double.getSize());
	}

	/**
	 * Tests add method for float values.
	 */
	private static void testForAddFloat() {
		float a = 52.524f;
		float b = 66.624f;
		float c = 78.824f;
		float d = 42.4242f;
		float e = 45.4624f;

		MaxHeapInterface<Float> test1Float = new ArrayMaxHeap<>();
		PriorityQueueInterface<Float> test2Float = new MaxHeapPriorityQueue<>();

		test1Float.add(a);
		test2Float.add(a);

		System.out.println("The size of the test1Float array is: " + test1Float.getSize());
		System.out.println("The size of the test2Float array is: " + test2Float.getSize());

		test1Float.add(b);
		test1Float.add(c);
		test1Float.add(d);
		test1Float.add(e);

		test2Float.add(b);
		test2Float.add(c);
		test2Float.add(d);
		test2Float.add(e);

		System.out.println("The size of the test1Float array is: " + test1Float.getSize());
		System.out.println("The size of the test2Float array is: " + test2Float.getSize());
	}

	/**
	 * Tests add method for negative integers.
	 */
	private static void testForAddNegatives() {
		int a = -55;
		int b = -33;
		int c = -45;
		int d = -21;
		int e = -69;

		MaxHeapInterface<Integer> test1NegativeInteger = new ArrayMaxHeap<>();
		PriorityQueueInterface<Integer> test2NegativeInteger = new MaxHeapPriorityQueue<>();

		test1NegativeInteger.add(a);
		test2NegativeInteger.add(a);

		System.out.println("The size of the test1NegativeInteger array is: " + test1NegativeInteger.getSize());
		System.out.println("The size of the test2NegativeInteger array is: " + test2NegativeInteger.getSize());

		test1NegativeInteger.add(b);
		test1NegativeInteger.add(c);
		test1NegativeInteger.add(d);
		test1NegativeInteger.add(e);

		test2NegativeInteger.add(b);
		test2NegativeInteger.add(c);
		test2NegativeInteger.add(d);
		test2NegativeInteger.add(e);

		System.out.println("The size of the test1NegativeInteger array is: " + test1NegativeInteger.getSize());
		System.out.println("The size of the test2NegativeInteger array is: " + test2NegativeInteger.getSize());

	}

	/**
	 * Tests the methods empty and clear.
	 */
	private static void testForIsEmptyAndIsClear() {
		int a = 55;
		int b = 33;
		int c = 45;

		MaxHeapInterface<Integer> test1IsEmpty = new ArrayMaxHeap<>();
		PriorityQueueInterface<Integer> test2IsEmpty = new MaxHeapPriorityQueue<>();

		System.out.println("Test for isEmpty: ");
		System.out.println("Is test1IsEmpty empty? " + test1IsEmpty.isEmpty());
		System.out.println("What is the size of test1IsEmpty? " + test1IsEmpty.getSize());
		System.out.println("Is test2IsEmpty empty? " + test2IsEmpty.isEmpty());
		System.out.println("What is the size of test2IsEmpty? " + test2IsEmpty.getSize());

		test1IsEmpty.add(a);
		test1IsEmpty.add(b);
		test1IsEmpty.add(c);
		test2IsEmpty.add(a);
		test2IsEmpty.add(b);
		test2IsEmpty.add(c);

		System.out.println("Is test1IsEmpty empty? " + test1IsEmpty.isEmpty());
		System.out.println("What is the size of test1IsEmpty? " + test1IsEmpty.getSize());
		System.out.println("Is test2IsEmpty empty? " + test2IsEmpty.isEmpty());
		System.out.println("What is the size of test2IsEmpty? " + test2IsEmpty.getSize());

		test1IsEmpty.clear();
		test2IsEmpty.clear();

		System.out.println("\nTest for is clear: ");
		System.out.println("Is test1IsEmpty empty? " + test1IsEmpty.isEmpty());
		System.out.println("What is the size of test1IsEmpty? " + test1IsEmpty.getSize());
		System.out.println("Is test2IsEmpty empty? " + test2IsEmpty.isEmpty());
		System.out.println("What is the size of test2IsEmpty? " + test2IsEmpty.getSize());

	}

	/**
	 * Manually tests values and returns the root node.
	 */
	private static void testForValues() {
		MaxHeapInterface<Integer> test1Values = new ArrayMaxHeap<>();
		PriorityQueueInterface<Integer> test2Values = new MaxHeapPriorityQueue<>();

		int a = 40;
		int b = 50;
		int c = 20;
		int d = 10;
		int e = 30;
		int f = 60;
		int g = 80;
		int h = 90;
		int i = 85;
		int j = 70;

		test1Values.add(a);
		test1Values.add(b);
		test1Values.add(c);
		test1Values.add(d);
		test1Values.add(e);
		test1Values.add(f);
		test1Values.add(g);
		test1Values.add(h);
		test1Values.add(j);

		test2Values.add(a);
		test2Values.add(b);
		test2Values.add(c);
		test2Values.add(d);
		test2Values.add(e);
		test2Values.add(f);
		test2Values.add(g);
		test2Values.add(h);
		test2Values.add(j);

		int t1 = test1Values.getMax();
		int t2 = test2Values.peek();

		test1Values.add(i);
		test2Values.add(i);

		if (t1 == t2) {
			System.out.println("The root node for t1 is: " + t1 + " and t2 is: " + t2);
		} else {
			System.out.println("The root node for t1 and t2 are not expected values");
		}

	}

	/**
	 * Tests array constructor and returns the root node.
	 */
	private static void testForConstructor() {
		MaxHeapInterface<Integer> test1Constructor;
		PriorityQueueInterface<Integer> test2Constructor;

		int a = 40;
		int b = 50;
		int c = 20;
		int d = 10;
		int e = 30;
		int f = 60;
		int g = 80;
		int h = 90;
		int i = 85;
		int j = 70;

		Integer[] array = { a, b, c, d, e, f, g, h, j, i };

		test1Constructor = new ArrayMaxHeap(array);
		test2Constructor = new MaxHeapPriorityQueue(array);

		int t1 = test1Constructor.getMax();
		int t2 = test2Constructor.peek();

		if (t1 == t2) {
			System.out.println("The root node for t1 is: " + t1 + " and t2 is: " + t2);
		} else {
			System.out.println("The root node for t1 and t2 are not expected values");
		}
	}

	/**
	 * Tests the remove method and returns the root node that has been removed.
	 */
	public static void testForRemoveRootNode() {

		MaxHeapInterface<Integer> test1Remove;
		PriorityQueueInterface<Integer> test2Remove;

		int a = 40;
		int b = 50;
		int c = 20;
		int d = 10;
		int e = 30;
		int f = 60;
		int g = 80;
		int h = 90;
		int i = 85;
		int j = 70;

		Integer[] array = { a, b, c, d, e, f, g, h, j, i };

		test1Remove = new ArrayMaxHeap(array);
		test2Remove = new MaxHeapPriorityQueue(array);

		int t1a = test1Remove.removeMax();
		int t1b = test1Remove.removeMax();
		int t2a = test2Remove.remove();
		int t2b = test2Remove.remove();

		if (t1a == t2a) {
			System.out.println("The previous root node of test1Remove is: " + t1a + " and of test2Remove is: " + t2a);
			if (t1b == t2b) {
				System.out.println("The previous root node of test1Remove is: " + t1b + " and of test2Remove is: " + t2b);
			}
		} else {
			System.out.println("The root node for t1 and t2 are not expected values");
		}
	}

}