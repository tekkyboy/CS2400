/**
 * 
 * ArrayMaxHeap is an implementation of the MaxHeapInterface, which organizes
 * elements in a specified order.
 * 
 * @author Parayao_K
 *
 * @param <T>
 */
public class ArrayMaxHeap<T extends Comparable<? super T>> implements MaxHeapInterface<T> {

	private T[] arrayHeap;
	public final static int DEFAULT_CAPACITY = 50;
	public final static int MAX_CAPACITY = 10000;
	private int size = 0;
	private int defaultPointer;
	private int childNode;
	private int parentNode;
	private int newIndex;

	public ArrayMaxHeap() {
		this(DEFAULT_CAPACITY);
	}

	public ArrayMaxHeap(int initialCapacity) {
		if (initialCapacity < DEFAULT_CAPACITY && initialCapacity < MAX_CAPACITY) {
			initialCapacity = DEFAULT_CAPACITY;
		} else if (initialCapacity > DEFAULT_CAPACITY && initialCapacity > MAX_CAPACITY) {
			throw new IndexOutOfBoundsException();
		}
		arrayHeap = (T[]) new Comparable[initialCapacity + 1];
		size = 0;
	}

	public ArrayMaxHeap(T[] array) {
		size = array.length + 1;
		arrayHeap = (T[]) new Comparable[size];
		for (int i = 1; i < size; i++) {
			arrayHeap[0] = null;
			arrayHeap[i] = array[i - 1];
			if (size <= MAX_CAPACITY) {
				childNode = i;
				buildMaxHeap(childNode);
			} else if (size > MAX_CAPACITY) {
				throw new IndexOutOfBoundsException();
			}
		}
	}

	/**
	 * Adds a new entry to this heap.
	 * 
	 * @param newEntry An object to be added.
	 */
	@Override
	public void add(T newEntry) {
		newIndex = size + 1;
		if (size <= MAX_CAPACITY) {
			childNode = newIndex;
			arrayHeap[childNode] = newEntry;
			maxUpHeapify(childNode);
			size++;
		} else if (size > MAX_CAPACITY) {
			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * Removes and returns the largest item in this heap.
	 * 
	 * @return Either the largest object in the heap or, if the heap is empty before
	 *         the operation, null.
	 */
	@Override
	public T removeMax() {
		T rootNode = null;
		if (!isEmpty()) {
			rootNode = arrayHeap[1];
			arrayHeap[1] = arrayHeap[size];
			size--;
			maxHeapify(1);
		}
		return rootNode;
	}

	/**
	 * Retrieves the largest item in this heap.
	 * 
	 * @return Either the largest object in the heap or, if the heap is empty, null.
	 */
	@Override
	public T getMax() {
		T rootNode = null;
		if (!isEmpty()) {
			rootNode = arrayHeap[1];
		}
		return rootNode;
	}

	/**
	 * Detects whether this heap is empty.
	 * 
	 * @return True if the heap is empty, or false otherwise.
	 */
	@Override
	public boolean isEmpty() {
		int size = getSize();
		boolean isEmpty = false;
		if (size == 0) {
			isEmpty = true;
		}
		return isEmpty;
	}

	/**
	 * Gets the size of this heap.
	 * 
	 * @return The number of entries currently in the heap.
	 */
	@Override
	public int getSize() {
		return size;
	}

	/** Removes all entries from this heap. */
	@Override
	public void clear() {
		while (size > -1) {
			arrayHeap[size] = null;
			size--;
		}
		size = 0;
	}

	/**
	 * Swap function between two integers
	 * 
	 * @param pt1
	 * @param pt2
	 */
	private void swap(int pt1, int pt2) {
		T temp = arrayHeap[pt1];
		arrayHeap[pt1] = arrayHeap[pt2];
		arrayHeap[pt2] = temp;
	}

	/**
	 * Adjust the heap in the case of a removal.
	 * 
	 * @param rootNode
	 */
	private void maxHeapify(int rootNode) {
		int leftChild = 2 * rootNode;
		int rightChild = leftChild + 1;
		parentNode = rootNode;
		if (leftChild <= size && arrayHeap[leftChild].compareTo(arrayHeap[parentNode]) > 0
				&& (int) arrayHeap[leftChild] > (int) arrayHeap[rightChild]) {
			parentNode = leftChild;
		} else if (rightChild <= size && arrayHeap[rightChild].compareTo(arrayHeap[parentNode]) > 0
				&& (int) arrayHeap[rightChild] > (int) arrayHeap[leftChild]) {
			parentNode = rightChild;
		} else if (parentNode != rootNode) {
			swap(rootNode, parentNode);
			maxHeapify(parentNode);
		}
		arrayHeap[1] = arrayHeap[parentNode];
	}

	/**
	 * Adjust the heap in case of an addition.
	 * 
	 * @param childNode
	 */
	private void maxUpHeapify(int childNode) {
		parentNode = childNode / 2;
		while (childNode > 1 && arrayHeap[parentNode].compareTo(arrayHeap[childNode]) < 0) {
			swap(parentNode, childNode);
			childNode = parentNode;
			parentNode = childNode / 2;
		}
	}

	/**
	 * Adjusts an array's elements through a heap.
	 * 
	 * @param childNode
	 */
	private void buildMaxHeap(int childNode) {
		parentNode = childNode / 2;
		while (childNode > 1 && arrayHeap[parentNode].compareTo(arrayHeap[childNode]) < 0) {
			swap(parentNode, childNode);
			childNode = parentNode;
			parentNode = childNode / 2;
		}
	}
}
