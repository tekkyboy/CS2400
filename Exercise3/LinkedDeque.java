
/**
 * Exercise Set 3 - LinkedDeque 10.26.19 CS2400.02
 * 
 * @author Parayao_K
 *
 * @param <T>
 */

public class LinkedDeque<T> implements DequeInterface<T> {

	private Node firstNode;
	private Node lastNode;
	private int entries;

	public LinkedDeque() {
		firstNode = null;
		lastNode = null;
	}

	@Override
	public void addToFront(T newEntry) {
		Node nodeAddNFront = new Node(newEntry, null, firstNode);
		addNodeToDeque(nodeAddNFront, true);
	}

	@Override
	public void addToBack(T newEntry) {
		Node nodeAddNBack = new Node(newEntry, lastNode, null);
		addNodeToDeque(nodeAddNBack, false);
	}

	/**
	 * 
	 * @param nodeToAdd
	 * @param addToFront
	 */
	private void addNodeToDeque(Node nodeToAdd, boolean addToFront) {
		if (nodeToAdd != null) {
			boolean empty = isEmpty();
			if (addToFront) {
				if (!empty) {
					firstNode.setPreviousNode(nodeToAdd);
				} else if (empty) {
					lastNode = nodeToAdd;
				}
				firstNode = nodeToAdd;
			} else {
				if (!empty) {
					lastNode.setNextNode(nodeToAdd);
				} else if (empty) {
					firstNode = nodeToAdd;
				}
				lastNode = nodeToAdd;
			}
			entries++;
		}
	}

	@Override
	public T removeFront() {
		T nodeNFront = getFront();
		firstNode = firstNode.getNextNode();
		if (firstNode != null) {
			firstNode.setPreviousNode(null);
		} else if (firstNode == null) {
			lastNode = null;
		}
		entries--;
		return nodeNFront;
	}

	@Override
	public T removeBack() {
		T nodeNBack = getBack();
		lastNode = lastNode.getPreviousNode();
		if (lastNode != null) {
			lastNode.setNextNode(null);
		} else if (lastNode == null) {
			firstNode = null;
		}
		entries--;
		return nodeNBack;
	}

	@Override
	public T getFront() {
		T data = null;
		boolean empty = isEmpty();
		if (!empty) {
			data = firstNode.getData();
		} else {
			throw new EmptyQueueException();
		}
		return data;

	}

	@Override
	public T getBack() {
		T data = null;
		boolean empty = isEmpty();
		if (!empty) {
			data = lastNode.getData();
		} else {
			throw new EmptyQueueException();
		}
		return data;
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

	/**
	 * 
	 * @return
	 */
	private int getLength() {
		return entries;
	}

	@Override
	public void clear() {
		firstNode = null;
		lastNode = null;
		entries = 0;
	}

	/**
	 * 
	 * @author Parayao_K
	 *
	 */
	private class Node {
		private T data = null;
		private Node next = null;
		private Node prior = null;

		/**
		 * 
		 * @param object
		 */
		private Node(T object) {
			this(object, null, null);
		}

		/**
		 * 
		 * @param object
		 * @param priorNode
		 * @param nextNode
		 */
		private Node(T object, Node priorNode, Node nextNode) {
			prior = priorNode;
			data = object;
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

		/**
		 * 
		 * @return
		 */
		private Node getPreviousNode() {
			return prior;
		}

		/**
		 * 
		 * @param priorNode
		 */
		private void setPreviousNode(Node priorNode) {
			prior = priorNode;
		}
	}

}
