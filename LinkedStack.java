/**
 * Implementation of a Stack ADT with a linked list.
 * 
 * @author Parayao_K
 *
 * @param <T>
 */

public final class LinkedStack<T> implements StackInterface<T> {
	private Node topNode;

	/**
	 * Constructor of an empty LinkedList
	 */
	public LinkedStack() {
		topNode = null;
	}

	/**
	 * Adds a new entry to the top of this stack.
	 * 
	 * @param newEntry An object to be added to the stack.
	 */
	@Override
	public void push(T newEntry) {
		Node newNode = new Node(newEntry, topNode);
		topNode = newNode;
	}

	/**
	 * Removes and returns this stack's top entry.
	 * 
	 * @return The object at the top of the stack or null if the stack is empty.
	 */
	@Override
	public T pop() {
		T top = peek();
		topNode = topNode.getNextNode();
		return top;
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
			return topNode.getData();
		}
	}

	/**
	 * Detects whether this stack is empty.
	 * 
	 * @return True if the stack is empty.
	 */
	@Override
	public boolean isEmpty() {
		boolean empty = false;

		if (topNode == null) {
			empty = true;
		}
		return empty;
	}

	/**
	 * Removes all entries from this stack.
	 */
	@Override
	public void clear() {
		topNode = null;
	}
	
	/**
	 * It is a container class for the LinkedStack.
	 * @author Parayao_K
	 *
	 */
	private class Node {
		private T data;
		private Node next;

		/**
		 * A constructor of the Node Class
		 * @param dataPortion The object to be added to the LinkedList
		 */
		private Node(T dataPortion) {
			this(dataPortion, null);
		}

		/**
		 * A constructor of the Node Class that adds a new node to the LinkedList
		 * @param dataPortion 
		 * @param nextNode The object to be added to the LinkedList
		 */
		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		}

		/**
		 * Gets the data in the LinkedList
		 * @return data
		 */
		private T getData() {
			return data;
		}

		/**
		 * Sets the data in the LinkedList
		 * @param newData
		 */
		/*private void setData(T newData) {
			data = newData;
		}*/ 

		/**
		 * Returns next Node
		 * @return next
		 */
		private Node getNextNode() {
			return next;
		}

		/**
		 * Sets the next Node
		 * @param nextNode
		 */
		/*private void setNextNode(Node nextNode) {
			next = nextNode;
		}*/
	}

}
