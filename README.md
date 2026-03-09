SingleLinkedList<T> is a generic singly linked list that uses an internal Node<T> class to store data and link to the next node. The list maintains a head, tail, and size to manage elements efficiently. If any get or remove method is called on an empty list, a NoSuchElementException is thrown.
Stack is an integer stack backed by an ArrayList<Integer> where the end of the list acts as the top of the stack. If pop() or peek() is called on an empty stack, an EmptyStackException is thrown.

<img width="676" height="745" alt="image" src="https://github.com/user-attachments/assets/88cd4ecf-5043-4225-a398-580236de1060" />
<img width="659" height="735" alt="image" src="https://github.com/user-attachments/assets/352e7bee-7463-4a3a-8ff3-875b0152ac45" />
<img width="693" height="744" alt="image" src="https://github.com/user-attachments/assets/f033b292-699c-44cb-b2c9-736fc3be2102" />


In the first screenshot, different values of 5, 30, 80, and 560 are pushed to prove the methods work with any input, producing Popped: 560, Peek: 80, and Average: 38.33.
In the second screenshot, isEmpty() is called on a fresh empty stack returning true, then values 10, 20, 30, and 40 are pushed producing Popped: 40, Peek: 30, and Average: 20.0.
In the third screenshot, isEmpty() is called after pushing a value of 10, returning false to show the stack is not empty. The stack is then pushed with 10, 20, 30, and 40, producing Popped: 40, Peek: 30, and Average: 17.5.
