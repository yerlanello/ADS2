# DOCUMENTATION FOR 2ND ASSIGNMENT
# MyList

Interface for implementing lists. Provides basic operations for working with lists.

add(T element): Adds an element to the list.

set(int index, T element): Sets the element at the specified index.

add(int index, T element): Adds an element to the list at the specified index.

addFirst(T element): Adds an element to the beginning of the list.

addLast(T element): Adds an element to the end of the list.

get(int index): Returns the element at the specified index.

remove(int index): Removes the element from the list at the specified index.

removeFirst(): Removes the first element from the list.

removeLast(): Removes the last element from the list.

sort(): Sorts the list.

indexOf(Object object): Returns the index of the first occurrence of the specified element
in the list.

LastIndexOf(Object object): Returns the index of the last occurrence of the specified element in the list.

exists(Object object): Checks if the element exists in the list.

toArray(): Converts the list to an array of objects.

clear(): Removes all elements from the list.

size(): Returns the number of elements in the list.

-------------------------------------------------------------------------------------------------------------------------------------

# MyStack

Implementation of a stack data structure. Allows adding and removing elements, as well as peeking the top of the stack.

MyStack(): Creates an empty stack.

MyStack(boolean useArrayList): Creates an empty stack with the specified underlying data structure.

push(T item): Adds an item to the top of the stack.

pop(): Removes and returns the item from the top of the stack.

peek(): Returns the item from the top of the stack without removing it.

isEmpty(): Checks if the stack is empty.

size(): Returns the number of elements in the stack.

-------------------------------------------------------------------------------------------------------------------------------------

# MyQueue

Implementation of a queue data structure. Allows adding and removing elements, as well as peeking the front of the queue.

MyQueue(): Creates an empty queue.

MyQueue(boolean useArrayList): Creates an empty queue with the specified underlying data structure.

enqueue(T item): Adds an item to the end of the queue.

dequeue(): Removes and returns the item from the front of the queue.

peek(): Returns the item from the front of the queue without removing it.

isEmpty(): Checks if the queue is empty.

size(): Returns the number of elements in the queue.

-------------------------------------------------------------------------------------------------------------------------------------

# MyMinHeap

Implementation of a min-heap data structure. Allows adding elements and extracting the minimum element.

MyMinHeap(): Creates an empty min-heap.

MyMinHeap(boolean useArrayList): Creates an empty min-heap with the specified underlying data structure.

insert(T item): Inserts an item into the heap.

extractMin(): Extracts and removes the minimum item from the heap.

isEmpty(): Checks if the heap is empty.

size(): Returns the number of elements in the heap.

-------------------------------------------------------------------------------------------------------------------------------------
