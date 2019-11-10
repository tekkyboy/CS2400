/**
 * 
 * Implementation of a Stack ADT with Arrays
 * 
 * @author Parayao_K
 *
 * @param <T>
 */
public final class ArrayStack<T> implements StackInterface<T> {

	private T[] stack;
	private int topIndex;
	private static final int DEFAULT_CAPACITY = 100;
	private static final int MAX_CAPACITY = 10000;

	/**
	 * Creates an empty stack whose default capacity is 100.
	 */
	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}

	/**
	 * Creates an empty stack with a given initial capacity.
	 * 
	 * @param initialCapacity The initial integer capacity desired.
	 */
	public ArrayStack(int initialCapacity) {
		if (isMaxCapacity(initialCapacity)) {
			stack = (T[]) new Object[initialCapacity];
			topIndex = -1;
		}
	}

	/**
	 * Checks if the initial integer capacity initialized exceeds the maximum
	 * capacity.
	 * 
	 * @param capacity
	 * @return check False if the initial integer capacity is greater than the
	 *         maximum capacity and true if not.
	 */
	private boolean isMaxCapacity(int capacity) {
		boolean check = false;
		if (capacity < MAX_CAPACITY) {
			check = true;
		}
		return check;
	}

	/**
	 * Adds a new entry to the top of this stack.
	 * 
	 * @param newEntry An object to be added to the stack.
	 */
	public void push(T newEntry) {
		if (isMaxCapacity(topIndex + 1)) {
			stack[topIndex + 1] = newEntry;
			topIndex++;
		}
	}

	/**
	 * Removes and returns this stack's top entry.
	 * 
	 * @return The object at the top of the stack or null if the stack is empty.
	 */
	@Override
	public T pop() {
		if (isEmpty()) {
			return null;
		} else {
			T top = stack[topIndex];
			stack[topIndex] = null;
			topIndex--;
			return top;
		}
	}

	/**
	 * Retrieves this stack's top entry.
	 * 
	 * @return The object at the top of the stack or null if the stack is empty.
	 */
	@Override
	public T peek() {
		if (isEmpty()) {
			return null;
		} else {
			return stack[topIndex];
		}
	}

	/**
	 * Detects whether this stack is empty.
	 * 
	 * @return True if the stack is empty.
	 */
	@Override
	public boolean isEmpty() {
		boolean empty = topIndex < 0;
		return empty;
	}

	/**
	 * Removes all entries from this stack.
	 */
	@Override
	public void clear() {
		for (int index = 0; index <= topIndex; index++) {
			stack[index] = null;
		}
		topIndex = -1;
	}
}