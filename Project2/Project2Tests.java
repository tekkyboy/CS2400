import static org.junit.Assert.*;

import org.junit.Test;

public class Project2Tests {

	@Test
	public <T> void test() {
		MaxHeapInterface<Integer> test1 = new ArrayMaxHeap<>();

		int a = 55;
		int b = 33;
		int c = 45;
		int d = 21;
		int e = 69;
		int f = 99;
		int g = 8;

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

	}

}
