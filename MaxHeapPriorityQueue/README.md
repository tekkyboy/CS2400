# CS2400
# Max Heap Priority Queue

This project is an implementation of a max heap array builder using two interfaces, 
two classes, and three methods without using any of the collections found in the Java library. 

For reference, a max heap is a tree-based data structure in which the tree is a complete binary tree, 
in which the key at the root node is the largest value of all the nodes in the tree. 

The class ArrayMaxHeap uses the interface MaxHeapInterface to add nodes, 
identify the largest node and remove the largest node. When the ArrayMaxHeap adds nodes and removes nodes, 
the methods maxUpHeap and maxHeapify are used for addition and removal of the largest node respectively. 

The class MaxHeapPriorityQueue uses the methods defined in ArrayMaxHeap.
The ArrayMaxHeap class has three constructors. The default constructor, 
a constructor to define the amount of elements in the array, and a constructor to accept a fully defined 
array in its parameter without using the add method. 
The last constructor is also used in The MaxHeapPrirorityQueue class.

For both the ArrayMaxHeap class and the MaxHeapPriorityQueue class, 
the array must resize dynamically and must not exceed or contain more than 10,000 elements. 

In the event that there should be more than 10,000 elements added or initialized in the array, 
the exception IndexOutOfBoundsException will be thrown.
