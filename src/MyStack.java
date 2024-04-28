import java.util.EmptyStackException;

public class MyStack<T> {
    private MyList<T> list;

    public MyStack() {
        list = new MyArrayList<>();
    }

    public MyStack(boolean useArrayList) {
        // Возможность выбора MyArrayList или MyLinkedList
        if (useArrayList) {
            list = new MyArrayList<>();
        } else {
            list = new MyLinkedList<>();
        }
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
