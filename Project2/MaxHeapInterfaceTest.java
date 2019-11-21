
public class MaxHeapInterfaceTest {

	public static void main(String[] args) {
		int a = 55;
		int b = 33;
		int c = 45;
		int d = 21;
		int e = 69;
		int f = 99;
		int g = 8;
		
		MaxHeapInterface<Integer> test1 = new ArrayMaxHeap<>();

		System.out.println("Test 1 is empty?: " + test1.isEmpty());

		test1.add(a);

		System.out.println("The size of the array is: " + test1.getSize());

		test1.add(b);
		test1.add(c);

		System.out.println("The size of the array is: " + test1.getSize());

		System.out.println("Test 1 is empty?: " + test1.isEmpty());

		test1.clear();

		System.out.println("The size of the array is: " + test1.getSize());

		System.out.println("Test 1 is empty?: " + test1.isEmpty());

		System.out.println("The largest number of the array is: " + test1.getMax());
		System.out.println("The largest number of the array is: " + test1.removeMax());

		test1.add(a);
		test1.add(b);
		test1.add(c);
		test1.add(d);
		test1.add(e);

		System.out.println("The largest number of the array is: " + test1.getMax());
		System.out.println("The largest number of the array was previously: " + test1.removeMax());
		System.out.println("The largest number of the array was previously: " + test1.removeMax());

		test1.clear();
		test1.add(b);
		test1.add(c);
		test1.add(a);
		test1.add(e);
		test1.add(d);

		System.out.println("The largest number of the array is: " + test1.getMax());
		System.out.println("The largest number of the array was previously: " + test1.removeMax());
		System.out.println("The largest number of the array was previously: " + test1.removeMax());

		test1.clear();
		test1.add(a);
		test1.add(b);
		test1.add(c);
		test1.add(d);
		test1.add(e);
		test1.add(f);
		test1.add(g);

		System.out.println("The largest number of the array is: " + test1.getMax());
		System.out.println("The largest number of the array was previously: " + test1.removeMax());
		System.out.println("The largest number of the array was previously: " + test1.removeMax());
		System.out.println("----------------------------------------------");

		// If the results are the same as the above, then it works
		PriorityQueueInterface<Integer> test2 = new MaxHeapPriorityQueue<>();

		System.out.println("Test 2 is empty?: " + test2.isEmpty());

		test2.add(a);

		System.out.println("The size of the array is: " + test2.getSize());

		test2.add(b);
		test2.add(c);

		System.out.println("The size of the array is: " + test2.getSize());

		System.out.println("Test 2 is empty?: " + test2.isEmpty());

		test2.clear();

		System.out.println("The size of the array is: " + test2.getSize());

		System.out.println("Test 1 is empty?: " + test2.isEmpty());

		System.out.println("The largest number of the array is: " + test2.peek());
		System.out.println("The largest number of the array is: " + test2.remove());

		test2.add(a);
		test2.add(b);
		test2.add(c);
		test2.add(d);
		test2.add(e);

		System.out.println("The largest number of the array is: " + test2.peek());
		System.out.println("The largest number of the array was previously: " + test2.remove());
		System.out.println("The largest number of the array was previously: " + test2.remove());

		test2.clear();
		test2.add(b);
		test2.add(c);
		test2.add(a);
		test2.add(e);
		test2.add(d);

		System.out.println("The largest number of the array is: " + test2.peek());
		System.out.println("The largest number of the array was previously: " + test2.remove());
		System.out.println("The largest number of the array was previously: " + test2.remove());

		test2.clear();
		test2.add(a);
		test2.add(b);
		test2.add(c);
		test2.add(d);
		test2.add(e);
		test2.add(f);
		test2.add(g);

		System.out.println("The largest number of the array is: " + test2.peek());
		System.out.println("The largest number of the array was previously: " + test2.remove());
		System.out.println("The largest number of the array was previously: " + test2.remove());
		System.out.println("----------------------------------------------");

	}

}
