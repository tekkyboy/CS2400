import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayStackTest {

	@Test
	public void testArray() {
		//fail("Not yet implemented");
		
		Car car1 = new Car("Red");
		Car car2 = new Car("yellow");
		
		StackInterface<Car> stack = new ArrayStack<Car>();
		
		stack.push(car1);
		stack.push(car2);
		
		Car a = stack.peek();
		Car b = stack.pop();
		Car c = stack.pop();
		
		System.out.println(b);
	}

	
	@Test
	public void testLinked() {
		//fail("Not yet implemented");
		
		Car car1 = new Car("Red");
		Car car2 = new Car("yellow");
		
		StackInterface<Car> stack = new LinkedStack<Car>();
		
		stack.push(car1);
		stack.push(car2);
		
		Car a = stack.peek();
		Car b = stack.pop();
		Car c = stack.pop();
		
		System.out.println(b);
	}

	
	class Car{
		int tire = 4;
		String color;
		
		Car(){
			
		}
		
		Car(String colr){
			this.color = colr;
		}
		public int getTire() {
			return tire;
		}
		public void setTire(int tire) {
			this.tire = tire;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		
	}
}
