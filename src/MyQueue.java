import java.util.NoSuchElementException;

public class MyQueue<T> {
    private MyList<T> list;

    public MyQueue() {
        list = new MyArrayList<>();
    }

    public MyQueue(boolean useArrayList) {
        if (useArrayList) {
            list = new MyArrayList<>();
        } else {
            list = new MyLinkedList<>();
        }
    }

    public void enqueue(T item) {
        list.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
