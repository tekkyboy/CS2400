import static org.junit.Assert.*;

import org.junit.Test;

public class HashSetTest {

//	@Test
	public void test() {
		HashSetInterface<Object> test1 = new HashSetLP();
		Car car1 = new Car("yellow");
		Car car2 = new Car("Red");
		Car car3 = new Car("Green");
		test1.add(car1);
		test1.add(car2);

		System.out.println("Size of test 1: " + test1.size());

		// test similar

		test1.add(car2);

		System.out.println("Size of test 1: " + test1.size());

//		System.out.println("Get hash index of car1 " + test1. getHashIndex(car1));
//		System.out.println("Get hash index of car2 " + test1.getHashIndex(car2));

		// test toArray?
		Object[] carArray = test1.toArray();
		for (int x = 0; x < carArray.length; x++) {
			Car abc = (Car) carArray[x];
			if (abc != null) {
				System.out.println(abc.getColor());
			}
		}

		test1.remove(car1);
		System.out.println("1 Size of test 1: " + test1.size());

		test1.add(car1);
		test1.add(car3);
		System.out.println("2 Size of test 1: " + test1.size());
		System.out.println("11  Does Test1 contain car1? " + test1.contains(car1));
		System.out.println("22 Does Test1 contain car2s? " + test1.contains(car2));
		test1.clear();

		System.out.println("3 Is Test 1 empty? " + test1.isEmpty());
		System.out.println("4 Does Test1 contain car1? " + test1.contains(car1));

	}

//	@Test
	public void test2() {
		HashSetInterface<Car> test2 = new HashSetLP();
		Car car1 = new Car("Yellow");
		Car car2 = new Car("Red");
		Car car3 = new Car("Blue");
		Car car5 = new Car("xxxx");
		test2.add(car1);
		test2.add(car1);

		System.out.println("Size of test 2: " + test2.size());

		test2.add(car2);
		test2.add(car3);
		System.out.println("Size of test 2: " + test2.size());

		test2.remove(car1);
		test2.contains(car2);
		System.out.println("Test 2 contains car1? " + test2.contains(car1));
		System.out.println("Test 2 contains car2? " + test2.contains(car2));

		Object[] carArray = test2.toArray();
		for (int x = 0; x < carArray.length; x++) {
			Car abc = (Car) carArray[x];
			if (abc != null) {
				System.out.println(abc.getColor());
			}
		}
		System.out.println("=======");
		test2.add(car5);
		Object[] carArray2 = test2.toArray();
		for (int x = 0; x < carArray2.length; x++) {
			Car abc = (Car) carArray2[x];
			if (abc != null) {
				System.out.println(abc.getColor());
			}
		}

		System.out.println("=======");
		test2.remove(car2);
		test2.add(new Car("www"));
		Object[] carArray3 = test2.toArray();
		for (int x = 0; x < carArray3.length; x++) {
			Car abc = (Car) carArray3[x];
			if (abc != null) {
				System.out.println(abc.getColor());
			}
		}

		System.out.println("Test 2 is empty? " + test2.isEmpty());

	}

	@Test
	public void test3() {
		HashSetInterface<Car> test3 = new HashSetQP();
		Car car1 = new Car("yellow");
		Car car2 = new Car("Red");
		Car car3 = new Car("Green");
		Car car4 = new Car("yellow");
		Car car5 = new Car("Red");
		Car car6 = new Car("Green");
		Car car7 = new Car("yellow");
		Car car8 = new Car("Red");
		Car car9 = new Car("Green");
		Car car10 = new Car("yellow");
		Car car11 = new Car("Red");
		Car car12 = new Car("Green");
		Car car13 = new Car("yellow");
		Car car14 = new Car("Red");
		Car car15 = new Car("Green");
		Car car16 = new Car("yellow");
		Car car17 = new Car("Red");
		Car car18 = new Car("Green");
		Car car19 = new Car("yellow");
		Car car20 = new Car("Red");
		Car car21 = new Car("Green");
		Car car22 = new Car("yellow");
		Car car23 = new Car("Red");
		Car car24 = new Car("Green");
		Car car25 = new Car("yellow");
		Car car26 = new Car("Red");
		Car car27 = new Car("Green");
		Car car28 = new Car("yellow");
		Car car29 = new Car("Red");
		Car car30 = new Car("Green");
		Car car31 = new Car("yellow");
		Car car32 = new Car("Red");
		Car car33 = new Car("Green");
		Car car34 = new Car("yellow");
		Car car35 = new Car("Red");
		Car car36 = new Car("Green");
		Car car37 = new Car("yellow");
		Car car38 = new Car("Red");
		Car car39 = new Car("Green");
		Car car40 = new Car("yellow");
		Car car41 = new Car("Red");
		Car car42 = new Car("Green");
		Car car43 = new Car("yellow");
		Car car44 = new Car("Red");
		Car car45 = new Car("Green");
		Car car46 = new Car("yellow");
		Car car47 = new Car("Red");
		Car car48 = new Car("Green");
		Car car49 = new Car("yellow");
		Car car50 = new Car("Red");
		Car car51 = new Car("Green");
		Car car52 = new Car("yellow");
		Car car53 = new Car("Red");
		Car car54 = new Car("Green");

		test3.add(car1);
		test3.add(car2);
		test3.add(car3);
		test3.add(car4);
		test3.add(car5);
		test3.add(car6);
		test3.add(car7);
		test3.add(car8);
		test3.add(car9);
		test3.add(car10);
		test3.add(car11);
		test3.add(car12);
		test3.add(car13);
		test3.add(car14);
		test3.add(car15);
		test3.add(car16);
		test3.add(car17);
		test3.add(car18);
		test3.add(car19);
		test3.add(car20);
		test3.add(car21);
		test3.add(car22);
		test3.add(car23);
		test3.add(car24);
		test3.add(car25);
		test3.add(car26);
		test3.add(car27);
		test3.add(car28);
		test3.add(car29);
		test3.add(car30);
		test3.add(car31);
		test3.add(car31);
		test3.add(car32);
		test3.add(car33);
		test3.add(car34);
		test3.add(car35);
		test3.add(car36);
		test3.add(car37);
		test3.add(car38);
		test3.add(car39);
		test3.add(car40);
		test3.add(car41);
		test3.add(car42);
		test3.add(car43);
		test3.add(car44);
		test3.add(car45);
		test3.add(car46);
		test3.add(car47);
		test3.add(car48);
		test3.add(car49);
		test3.add(car50);
		test3.add(car51);
		test3.add(car52);
		test3.add(car53);
		test3.add(car54);

		System.out.println("Size of test 3: " + test3.size());
	}
}

class Car {
	int wheels = 4;
	int doors = 4;
	String color = "grey";

	Car() {

	}

	Car(String color) {
		this.color = color;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wh) {
		wheels = wh;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int d) {
		doors = d;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String col) {
		color = col;
	}

	@Override
	public int hashCode() {
		// simple one-line implementation
		return 12345;
	}
}
