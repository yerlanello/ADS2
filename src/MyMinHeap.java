public class MyMinHeap<T extends Comparable<T>> {
    private MyList<T> heap;

    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    public MyMinHeap(boolean useArrayList) {
        if (useArrayList) {
            heap = new MyArrayList<>();
        } else {
            heap = new MyLinkedList<>();
        }
    }

    public void insert(T item) {
        heap.add(item);
        heapifyUp(heap.size() - 1);
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap.get(index).compareTo(heap.get(parentIndex)) < 0) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    public T extractMin() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        T minItem = heap.get(0);
        T lastItem = heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heap.set(0, lastItem);
            heapifyDown(0);
        }
        return minItem;
    }

    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallestChildIndex = index;

        if (leftChildIndex < heap.size() && heap.get(leftChildIndex).compareTo(heap.get(smallestChildIndex)) < 0) {
            smallestChildIndex = leftChildIndex;
        }
        if (rightChildIndex < heap.size() && heap.get(rightChildIndex).compareTo(heap.get(smallestChildIndex)) < 0) {
            smallestChildIndex = rightChildIndex;
        }

        if (smallestChildIndex != index) {
            swap(index, smallestChildIndex);
            heapifyDown(smallestChildIndex);
        }
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
