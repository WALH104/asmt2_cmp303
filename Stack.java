import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {

    private ArrayList<Integer> list; // backing store for the stack

    public Stack() { list = new ArrayList<>(); }

    // Pushes a value onto the top of the stack
    public void push(int value) { list.add(value); }

    // Removes and returns the top element
    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        return list.remove(list.size() - 1);
    }

    // Returns the top element without removing it
    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return list.get(list.size() - 1);
    }

    // Returns true if the stack has no elements
    public boolean isEmpty() { return list.isEmpty(); }

    // Returns the number of elements in the stack
    public int size() { return list.size(); }

    // Returns the average of all elements in the stack
    public double average() {
        if (isEmpty()) throw new EmptyStackException();
        int sum = 0;
        for (int val : list) sum += val;
        return (double) sum / list.size();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("isEmpty: " + stack.isEmpty());

        stack.push(5);
        stack.push(30);
        stack.push(80);
        stack.push(560);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Average: " + stack.average());
    }
}