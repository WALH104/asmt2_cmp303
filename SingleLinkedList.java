import java.util.NoSuchElementException;

public class SingleLinkedList<T> {

    // Node class to hold data and a reference to the next node
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; this.next = null; }
    }

    private Node<T> head; // first node
    private Node<T> tail; // last node
    private int size;     // number of elements

    public SingleLinkedList() { head = null; tail = null; size = 0; }

    // Returns true if the list is empty
    public boolean isEmpty() { return size == 0; }

    // Adds item to the front of the list
    public void addFirst(T item) {
        Node<T> node = new Node<>(item);
        if (isEmpty()) { head = node; tail = node; }
        else { node.next = head; head = node; }
        size++;
    }

    // Adds item to the end of the list
    public void addLast(T item) {
        Node<T> node = new Node<>(item);
        if (isEmpty()) { head = node; tail = node; }
        else { tail.next = node; tail = node; }
        size++;
    }

    // Removes and returns the first element
    public T removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("List is empty.");
        T data = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return data;
    }

    // Removes and returns the last element
    public T removeLast() {
        if (isEmpty()) throw new NoSuchElementException("List is empty.");
        T data = tail.data;
        if (head == tail) { head = null; tail = null; }
        else {
            Node<T> current = head;
            while (current.next != tail) current = current.next;
            current.next = null;
            tail = current;
        }
        size--;
        return data;
    }

    // Returns the first element without removing it
    public T getFirst() {
        if (isEmpty()) throw new NoSuchElementException("List is empty.");
        return head.data;
    }

    // Returns the last element without removing it
    public T getLast() {
        if (isEmpty()) throw new NoSuchElementException("List is empty.");
        return tail.data;
    }

    // Inserts item at the given index, or at the end if index >= size
    public void insert(int index, T item) {
        if (index <= 0) { addFirst(item); return; }
        if (index >= size) { addLast(item); return; }
        Node<T> node = new Node<>(item);
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) current = current.next;
        node.next = current.next;
        current.next = node;
        size++;
    }

    // Removes item at the given index, returns false if out of bounds
    public boolean remove(int index) {
        if (index < 0 || index >= size) return false;
        if (index == 0) { removeFirst(); return true; }
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) current = current.next;
        if (current.next == tail) tail = current;
        current.next = current.next.next;
        size--;
        return true;
    }

    // Returns the index of the first occurrence of item, or size if not found
    public int find(T item) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(item)) return index;
            current = current.next;
            index++;
        }
        return size;
    }
}