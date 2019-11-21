
/**
 * Exercise Set 3 - LinkedList 10.26.19 CS2400.02
 * 
 * @author Parayao_K
 *
 * @param <T>
 */

public class LinkedList<T> implements ListInterface<T> {

	private static final String ILLEGAL_ADD = "Illegal position given to add operation.";
	private static final String ILLEGAL_REMOVE = "Illegal position given to remove operation.";
	private static final String ILLEGAL_POSITION_TO = "Illegal position given to replace operation.";
	private static final String ILLEGAL_POSITION = "Illegal position given to getEntry operation.";
	private Node firstNode;
	private int entries;

	@Override
	public void add(T newEntry) {
		Node nodeN = new Node(newEntry);
		if (!isEmpty()) {
			Node lastNode = getNodeAt(entries);
			lastNode.setNextNode(nodeN);
		} else if (isEmpty()) {
			firstNode = nodeN;
		}
		entries++;
	}

	@Override
	public void add(int position, T newEntry) {
		if (position >= 1 && position <= entries + 1) {
			addNodeToList(position, newEntry);
		} else {
			throw new IndexOutOfBoundsException(ILLEGAL_ADD);
		}
	}

	/**
	 * 
	 * @param position
	 * @param data
	 */
	private void addNodeToList(int position, T data) {
		Node nodeN = new Node(data);
		if (position == 1) {
			nodeN.setNextNode(firstNode);
			firstNode = nodeN;
		} else {
			Node previousNode = getNodeAt(position - 1);
			Node nextNode = previousNode.getNextNode();
			nodeN.setNextNode(nextNode);
			previousNode.setNextNode(nodeN);
		}
		entries++;
	}

	@Override
	public T remove(int position) {
		T data = null;
		if (position >= 1 && position <= entries) {
			data = removeNodeFromList(position);
		} else {
			throw new IndexOutOfBoundsException(ILLEGAL_REMOVE);
		}
		return data;
	}

	/**
	 * 
	 * @param position
	 * @return
	 */
	private T removeNodeFromList(int position) {
		T removed = null;
		if (position == 1) {
			removed = firstNode.getData();
			firstNode = firstNode.getNextNode();
		} else {
			Node removedNode = getNodeAt(position);
			Node previousNode = getNodeAt(position - 1);
			removed = getNodeAt(position).getData();
			Node nextNode = removedNode.getNextNode();
			previousNode.setNextNode(nextNode);
		}
		entries--;
		return removed;
	}

	@Override
	public void clear() {
		for (int i = getLength(); i > 0; i--) {
			remove(i);
		}
	}

	@Override
	public T replace(int position, T newEntry) {
		T data = null;
		if (position >= 1 && position <= entries) {
			Node node = getNodeAt(position);
			if (node != null) {
				data = node.getData();
				node.setData(newEntry);
			}
		} else {
			throw new IndexOutOfBoundsException(ILLEGAL_POSITION_TO);
		}
		return data;
	}

	@Override
	public T getEntry(int position) {
		T data = null;
		if (position >= 1 && position <= entries) {
			Node node = getNodeAt(position);
			data = node.getData();
		} else {
			throw new IndexOutOfBoundsException(ILLEGAL_POSITION);
		}
		return data;
	}

	@Override
	public boolean contains(T anEntry) {
		boolean isFound = false;
		for (int i = 1; i <= getLength(); i++) {
			Node node = getNodeAt(i);
			if (anEntry.equals(node.getData())) {
				isFound = true;
				break;
			}
		}
		return isFound;
	}

	@Override
	public int getLength() {
		return entries;
	}

	@Override
	public boolean isEmpty() {
		boolean isEmpty = true;
		for (int i = 0; i < getLength(); i++) {
			isEmpty = false;
			break;
		}
		return isEmpty;
	}

	/*
	 * Get the node at the position
	 */
	private Node getNodeAt(int position) {
		Node node = firstNode;

		for (int i = 1; i < getLength(); i++) {
			if (i == position) {
				break;
			}
			node = node.getNextNode();
		}
		return node;
	}

	/**
	 * 
	 * @author Parayao_K The Node class. Contains generic data and node pointer to
	 *         the next node.
	 *
	 */
	private class Node {
		private T data = null;
		private Node next = null;

		/**
		 * 
		 * @param dataObject
		 */
		private Node(T dataObject) {
			this(dataObject, null);
		}

		/**
		 * 
		 * @param dataObject
		 * @param nextNode
		 */
		private Node(T dataObject, Node nextNode) {
			data = dataObject;
			next = nextNode;
		}

		/**
		 * 
		 * @return
		 */
		private T getData() {
			return data;
		}

		/**
		 * 
		 * @param newData
		 */
		private void setData(T newData) {
			data = newData;
		}

		/**
		 * 
		 * @return
		 */
		private Node getNextNode() {
			return next;
		}

		/**
		 * 
		 * @param nextNode
		 */
		private void setNextNode(Node nextNode) {
			next = nextNode;
		}

	}

}
