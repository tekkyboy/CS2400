public class MaxHeapPriorityQueue<T extends Comparable<? super T>> implements PriorityQueueInterface<T> {

	private MaxHeapInterface<T> priorityQueueAMH;
	private T[] arrayHeap;
	public final static int MAX_CAPACITY = 10000;
	private int size = 0;
	private int defaultPointer = 0;
	private int parentNode;
	private int childNode;
	private int newIndex;

	public MaxHeapPriorityQueue() {
		priorityQueueAMH = new ArrayMaxHeap<>();
	}

	public MaxHeapPriorityQueue(T[] array) {
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
	 * Adds a new entry to the priority queue
	 * 
	 * @param newEntry An object to be added
	 */
	@Override
	public void add(T newEntry) {
		priorityQueueAMH.add(newEntry);
	}

	/**
	 * Removes and returns the entry having the highest priority
	 * 
	 * @return The object having the highest priority or, if the priority queue is
	 *         empty before the operation, null.
	 */
	@Override
	public T remove() {
		boolean isEmpty = isEmpty();
		if (isEmpty) {
			return null;
		}
		return priorityQueueAMH.removeMax();
	}

	/**
	 * Retrieves the entry having the highest priority.
	 * 
	 * @return Either the object having the highest priority or, if the priority
	 *         queue is empty, null.
	 */
	@Override
	public T peek() {
		boolean isEmpty = isEmpty();
		if (isEmpty) {
			return null;
		}
		return priorityQueueAMH.getMax();
	}

	/**
	 * Detects whether this priority queue is empty.
	 * 
	 * @return True if the priority queue is empty or false otherwise.
	 */
	@Override
	public boolean isEmpty() {
		return priorityQueueAMH.isEmpty();
	}

	/**
	 * Gets the size of this priority queue
	 * 
	 * @return The number of entries currently in the priority queue.
	 */
	@Override
	public int getSize() {
		return priorityQueueAMH.getSize();
	}

	/**
	 * Removes all entries from this priority queue.
	 */
	@Override
	public void clear() {
		priorityQueueAMH.clear();
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
