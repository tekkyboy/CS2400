public class MaxHeapPriorityQueue<T extends Comparable<? super T>> implements PriorityQueueInterface<T> {

	private MaxHeapInterface<T> priorityQueueAMH;

	public MaxHeapPriorityQueue() {
		priorityQueueAMH = new ArrayMaxHeap<>();
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

}
