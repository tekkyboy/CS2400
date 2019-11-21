public class HashSetLP<T> implements HashSetInterface<T> {

	private static int numberOfEntries = 157;
	private Object[] hashTable;
	private int size;
	private int hIndex;
	private T[] objectArray;

	public HashSetLP() {
		hashTable = new Object[numberOfEntries];
		size = 0;
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public int getHashIndex(T key) {
		int hashIndex = key.hashCode() % numberOfEntries;
		if (hashIndex < 0) {
			hashIndex = hashIndex + numberOfEntries;
		}
		return hashIndex;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		boolean isEmpty = false;
		if (size == 0) {
			isEmpty = true;
		}
		return isEmpty;
	}

	@Override
	public boolean contains(T item) {
		int index = getHashIndex(item);
		int linearIndex = linearProbe(index, item);
		return isInSet(hashTable, linearIndex);
	}

	/**
	 * 
	 * @param array
	 * @param pos
	 * @return
	 */
	private boolean isInSet(Object[] array, int pos) {
		return array[pos] != null;
	}

	/**
	 * 
	 * @param index
	 * @param item
	 * @return
	 */
	private int linearProbe(int index, T item) {
		int counter = 0;
		boolean isFound = false;
		int defaultIndex = -1;
		while (!isFound && (hashTable[index] != null)) {
			if ( hashTable[index] instanceof AvailHolder) {
				break;
			}
			
			if (hashTable[index] != null) {
				if (item.equals(hashTable[index])) {
					isFound = true;
				} else {
					index = (index + 1) % hashTable.length;
				}
			} else {
				if (defaultIndex == -1) {
					defaultIndex = index;
				}
				index = (index + 1) % hashTable.length;
			}
			if (counter >= 31) {
				break;
			}
			counter++;
		}
		
		
		if (isFound || defaultIndex == -1) {
			return index;
		} else {
			return defaultIndex;
		}
	}

	@Override
	public T[] toArray() {
		int capacity = 0;
		objectArray = (T[]) new Object[numberOfEntries];

		for (int index = 0; index < hashTable.length; index++) {
			if (hashTable[index] != null ) {
				if ( !(hashTable[index] instanceof AvailHolder)) {
					objectArray[capacity] = (T) hashTable[index];
					capacity++;
				}
			}
		}
		return objectArray;
	}

	@Override
	public boolean add(T item) {
		boolean isAdded = false;
		hIndex = getHashIndex(item);
		if (hashTable[hIndex] == null || hashTable[hIndex] instanceof AvailHolder) {
			hashTable[hIndex] = item;
			size++;
		} else {
			int linearIndex = linearProbe(hIndex, item);
			if (hashTable[linearIndex] == null || hashTable[linearIndex] instanceof AvailHolder) {
				hashTable[linearIndex] = item;
				size++;
			}
		}
		return isAdded;
	}

	@Override
	public T remove(T item) {
		hIndex = getHashIndex(item);
		int linearIndex = linearProbe(hIndex, item);
		if (linearIndex != -1) {
			hashTable[linearIndex] = new AvailHolder();
			size--;
		}
		return (T) hashTable[linearIndex];
	}

	@Override
	public void clear() {
		for (int index = 0; index < hashTable.length; index++) {
			if (hashTable[index] != null) {
				hashTable[index] = null;
			}
		}
		size = 0;
	}

	
	class AvailHolder<T> {	
	}


}


