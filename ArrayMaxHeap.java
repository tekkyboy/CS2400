/**
 * 
 * @author Parayao_K
 *
 * @param <T>
 */
public class ArrayMaxHeap<T extends Comparable<? super T>> implements MaxHeapInterface<T> {

	private int size = 0;
	private T[] arrayHeap = (T[]) new Object[10000];

	/**
	 * Adds a new entry to this heap.
	 * 
	 * @param newEntry An object to be added.
	 */
	@Override
	public void add(T newEntry) {
		int childNode = size;
		int parentNode = childNode / 2;
		while ((childNode > 1) && (arrayHeap[parentNode].compareTo(arrayHeap[childNode]) < 0)) {
			arrayHeap[childNode] = arrayHeap[parentNode];
			childNode = parentNode;
			parentNode = childNode / 2;
		}
		arrayHeap[childNode] = newEntry;
		size++;
		// maxUpHeapify();
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
		while (arrayHeap[size] != null) {
			arrayHeap[size] = null;
			size--;
		}
		size = 0;
	}

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
		int largestNode = rootNode;
		if (leftChild <= size && arrayHeap[leftChild].compareTo(arrayHeap[rootNode]) > 0) {
			largestNode = leftChild;
		} else if (rightChild <= size && arrayHeap[rightChild].compareTo(arrayHeap[largestNode]) > 0) {
			largestNode = rightChild;
		} else if (largestNode != rootNode) {
			swap(rootNode, largestNode);
			maxHeapify(largestNode);
		}
	}

}
