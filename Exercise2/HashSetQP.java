public class HashSetQP<T> implements HashSetInterface<T> {

	private static final int numberOfEntries = 157;
	private int size;
	private Object[] hashTable;
	private T[] objectArray;
	private int hIndex;

	public HashSetQP() {
		hashTable = new Object[numberOfEntries];
		size = 0;
	}

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
		int quadraticIndex = quadraticProbe(index, item);
		return isInSet(hashTable, quadraticIndex);
	}

	private static boolean isInSet(Object[] array, int pos) {
		return array[pos] != null;
	}

	/**
	 * 
	 * @param index
	 * @param key
	 * @return
	 */
	private int quadraticProbe(int index, T item) {
		int counter = 0;
		int i = 0;
		int k = index;// key.hashCode() % numberOfEntries;
		while (hashTable[k] != null && !item.equals(hashTable[k])) {
			i = i + 1;
			if ( hashTable[k] instanceof AvailHolder) {
				break;
			}
			
			if (hashTable[k] != null) {
				k = item.hashCode() % numberOfEntries;
			}
			k = (int) (k + Math.pow(i, 2));
			if (k >= numberOfEntries) {
				k = k - numberOfEntries;
			}
			if (counter >= 31) {
				break;
			}
			counter++;
		}
		return k;
	}

	@Override
	public T[] toArray() {
		int capacity = 0;
		objectArray = (T[]) new Object[numberOfEntries];

		for (int index = 0; index < hashTable.length; index++) {
			if (hashTable[index] != null) {
				if (!(hashTable[index] instanceof AvailHolder)) {
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
			int quadraticIndex = quadraticProbe(hIndex, item);
			if (hashTable[quadraticIndex] == null || hashTable[quadraticIndex] instanceof AvailHolder) {
				hashTable[quadraticIndex] = item;
				size++;
			}
		}
		return isAdded;
	}

	@Override
	public T remove(T item) {
		hIndex = getHashIndex(item);
		int quadraticIndex = quadraticProbe(hIndex, item);
		if (quadraticIndex != -1) {
			hashTable[quadraticIndex] = new AvailHolder();
			size--;
		}
		return (T) hashTable[quadraticIndex];

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
