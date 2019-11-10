import static org.junit.Assert.*;

import org.junit.Test;

public class E3Test {

//	@Test
	public void test() {
		ListInterface<Car> test1 = new LinkedList<>();

		Car car1 = new Car(4, "Blue");
		Car car2 = new Car(6, "Green");
		Car car3 = new Car(6, "Yellow");
		Car car4 = new Car(4, "White");

		test1.add(car1);
		test1.add(car2);
		test1.add(car3);

		for (int i = 1; i <= test1.getLength(); i++) {
			Car carFound = test1.getEntry(i);
			System.out.println("This car is found here: " + carFound);
		}
		System.out.println("-----------------");

		System.out.println("List contains car2?: " + test1.contains(car2));

		System.out.println("-----------------");

		// test1.remove(1);
		test1.remove(2);

		System.out.println("List contains car2?: " + test1.contains(car2));

		System.out.println("-----------------");

		for (int i = 1; i <= test1.getLength(); i++) {
			Car carFound = test1.getEntry(i);
			System.out.println("This car is found here: " + carFound);
		}
		System.out.println("-----------------");

		test1.replace(2, car4);

		for (int i = 1; i <= test1.getLength(); i++) {
			Car carFound = test1.getEntry(i);
			System.out.println("This car is found here: " + carFound);
		}
		System.out.println("-----------------");

		System.out.println("Linked List is empty? " + test1.isEmpty());
		System.out.println("-----------------");

		test1.clear();

		System.out.println("Linked List is empty? " + test1.isEmpty());
		System.out.println("-----------------");

		test1.add(car1);
		test1.add(car2);
		test1.add(car3);
		test1.add(car1);
		test1.add(car2);
		test1.add(car3);

		for (int i = 1; i <= test1.getLength(); i++) {
			Car carFound = test1.getEntry(i);
			System.out.println("This car is found here: " + carFound);
		}
		System.out.println("-----------------");

		System.out.println("Linked List is empty? " + test1.isEmpty());

		for (int i = test1.getLength(); i >= 1; i--) {
			Car carRemoved = test1.remove(i);
			System.out.println("This car is removed here: " + carRemoved);
		}
		System.out.println("Linked List is empty? " + test1.isEmpty());

	}

	@Test
	public void test2() {
		DequeInterface<Car> test1 = new LinkedDeque<>();

		Car car1 = new Car(4, "Blue");
		Car car2 = new Car(6, "Green");
		Car car3 = new Car(6, "Yellow");
		Car car4 = new Car(4, "White");

		test1.addToFront(car1);
		test1.addToFront(car2);

		System.out.println("This car is at the front " + test1.getFront());
		System.out.println("This car is at the back " + test1.getBack());

		test1.addToBack(car4);

		System.out.println("---------------------------");

		System.out.println("This car is at the front " + test1.getFront());
		System.out.println("This car is at the back " + test1.getBack());

		System.out.println("---------------------------");

		test1.removeBack();
		test1.removeBack();

		System.out.println("---------------------------");

		System.out.println("This car is at the front " + test1.getFront());
		System.out.println("This car is at the back " + test1.getBack());

		System.out.println("---------------------------");

		System.out.println("This deque is empty? " + test1.isEmpty());

		test1.clear();

		System.out.println("This deque is empty? " + test1.isEmpty());

		System.out.println("---------------------------");

		test1.addToFront(car1);
		test1.addToFront(car2);

		System.out.println("This car is at the front " + test1.getFront());
		System.out.println("This car is at the back " + test1.getBack());

		test1.addToBack(car4);

		System.out.println("This car is at the front " + test1.getFront());
		System.out.println("This car is at the back " + test1.getBack());

		Car removedCar = test1.removeFront();
		Car removedCar2 = test1.removeFront();

		System.out.println("---------------------------");

		System.out.println("This car removed is Green " + removedCar);
		System.out.println("This car removed is Blue " + removedCar2);

		System.out.println("---------------------------");

		test1.removeFront();
		test1.removeBack();

	}

//	@Test
	public void testAddCar() {
		ListInterface<Car> test3 = new LinkedList<>();

		Car car1 = new Car(4, "Blue");
		Car car2 = new Car(6, "Green");
		Car car3 = new Car(6, "Yellow");
		Car car4 = new Car(4, "White");

		test3.add(car1);
		// test3.add(car2);
		// test3.add(car3);
		test3.add(2, car2);

		for (int i = 1; i <= test3.getLength(); i++) {
			Car carFound = test3.getEntry(i);
			System.out.println("This car is found here: " + carFound);
		}
		test3.add(5, car3);
	}

//	@Test
	public void testRemoveCar() {
		ListInterface<Car> test3 = new LinkedList<>();

		Car car1 = new Car(4, "Blue");
		Car car2 = new Car(6, "Green");
		Car car3 = new Car(6, "Yellow");
		Car car4 = new Car(4, "White");

		test3.add(car1);
		// test3.add(car2);
		// test3.add(car3);
		test3.add(2, car2);
		test3.add(car3);

		test3.remove(2);
		for (int i = 1; i <= test3.getLength(); i++) {
			Car carFound = test3.getEntry(i);
			System.out.println("This car is found here: " + carFound);
		}
		test3.remove(5);

	}

//	@Test
	public void testReplaceCar() {
		ListInterface<Car> test3 = new LinkedList<>();

		Car car1 = new Car(4, "Blue");
		Car car2 = new Car(6, "Green");
		Car car3 = new Car(6, "Yellow");
		Car car4 = new Car(4, "White");

		test3.add(car1);
		// test3.add(car2);
		// test3.add(car3);
		test3.add(2, car2);
		test3.add(car3);

		Car replacedCar = test3.replace(2, car3);
		System.out.println("Replaced car is: " + replacedCar);
		for (int i = 1; i <= test3.getLength(); i++) {
			Car carFound = test3.getEntry(i);
			System.out.println("This car is found here: " + carFound);
		}
		test3.getEntry(5);
		test3.replace(5, car3);

	}

}

class Car {

	int wheels = 4;
	String color = "red";

	Car() {

	}

	Car(int wh, String c) {
		wheels = wh;
		color = c;
	}

	public String toString() {
		return color;
	}

}
