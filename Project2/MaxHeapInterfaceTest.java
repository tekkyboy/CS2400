
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
		testForSpecialConstructor();
	}

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

	private static void divideSpace() {
		System.out.println("------------------------");
	}

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

	private static void testForSpecialConstructor() {
		MaxHeapInterface<Integer> test1Constructor = new ArrayMaxHeap<>();
		PriorityQueueInterface<Integer> test2Constructor = new MaxHeapPriorityQueue<>();

		Integer[] array = {88, 42, 100, 99, 70, 50, 81};

		MaxHeapInterface amh = new ArrayMaxHeap(array);
		PriorityQueueInterface pqi = new MaxHeapPriorityQueue(array);
		
		System.out.println("The max of amh is: " + amh.getMax());
		System.out.println("The max of pqi is: " + pqi.peek());

	}

}

//
//MaxHeapInterface<Integer> test1 = new ArrayMaxHeap<>();
//
//
//System.out.println("Test 1 is empty?: " + test1.isEmpty());
//
//test1.add(a);
//
//System.out.println("The size of the array is: " + test1.getSize());
//
//test1.add(b);
//test1.add(c);
//
//System.out.println("The size of the array is: " + test1.getSize());
//
//System.out.println("Test 1 is empty?: " + test1.isEmpty());
//
//test1.clear();
//
//System.out.println("The size of the array is: " + test1.getSize());
//
//System.out.println("Test 1 is empty?: " + test1.isEmpty());
//
//System.out.println("The largest number of the array is: " + test1.getMax());
//System.out.println("The largest number of the array is: " + test1.removeMax());
//
//test1.add(a);
//test1.add(b);
//test1.add(c);
//test1.add(d);
//test1.add(e);
//
//System.out.println("The largest number of the array is: " + test1.getMax());
//System.out.println("The largest number of the array was previously: " + test1.removeMax());
//System.out.println("The largest number of the array was previously: " + test1.removeMax());
//
//test1.clear();
//test1.add(b);
//test1.add(c);
//test1.add(a);
//test1.add(e);
//test1.add(d);
//
//System.out.println("The largest number of the array is: " + test1.getMax());
//System.out.println("The largest number of the array was previously: " + test1.removeMax());
//System.out.println("The largest number of the array was previously: " + test1.removeMax());
//
//test1.clear();
//test1.add(a);
//test1.add(b);
//test1.add(c);
//test1.add(d);
//test1.add(e);
//test1.add(f);
//test1.add(g);
//
//System.out.println("The largest number of the array is: " + test1.getMax());
//System.out.println("The largest number of the array was previously: " + test1.removeMax());
//System.out.println("The largest number of the array was previously: " + test1.removeMax());
//System.out.println("----------------------------------------------");
//
//
//
//// If the results are the same as the above, then it works
//PriorityQueueInterface<Integer> test2 = new MaxHeapPriorityQueue<>();
//
//System.out.println("Test 2 is empty?: " + test2.isEmpty());
//
//test2.add(a);
//
//System.out.println("The size of the array is: " + test2.getSize());
//
//test2.add(b);
//test2.add(c);
//
//System.out.println("The size of the array is: " + test2.getSize());
//
//System.out.println("Test 2 is empty?: " + test2.isEmpty());
//
//test2.clear();
//
//System.out.println("The size of the array is: " + test2.getSize());
//
//System.out.println("Test 1 is empty?: " + test2.isEmpty());
//
//System.out.println("The largest number of the array is: " + test2.peek());
//System.out.println("The largest number of the array is: " + test2.remove());
//
//test2.add(a);
//test2.add(b);
//test2.add(c);
//test2.add(d);
//test2.add(e);
//
//System.out.println("The largest number of the array is: " + test2.peek());
//System.out.println("The largest number of the array was previously: " + test2.remove());
//System.out.println("The largest number of the array was previously: " + test2.remove());
//
//test2.clear();
//test2.add(b);
//test2.add(c);
//test2.add(a);
//test2.add(e);
//test2.add(d);
//
//System.out.println("The largest number of the array is: " + test2.peek());
//System.out.println("The largest number of the array was previously: " + test2.remove());
//System.out.println("The largest number of the array was previously: " + test2.remove());
//
//test2.clear();
//test2.add(a);
//test2.add(b);
//test2.add(c);
//test2.add(d);
//test2.add(e);
//test2.add(f);
//test2.add(g);
//
//System.out.println("The largest number of the array is: " + test2.peek());
//System.out.println("The largest number of the array was previously: " + test2.remove());
//System.out.println("The largest number of the array was previously: " + test2.remove());
//System.out.println("----------------------------------------------");