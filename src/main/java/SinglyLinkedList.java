import javax.management.RuntimeErrorException;

public class SinglyLinkedList<T> {

    // Inner Node class.
    public class Node<T> {
        // Properties of the Node class.
        // The two properties should be:
        // 1. data (the data stored in the node).
        // 2. next (a reference (also known as a pointer) to the next node.
        T data;
        Node<T> next;

        // Constructor of the Node class.
        // The constructor should set the data property of the Node to be the value passed as a parameter.
        // The constructor should set the next property of the Node to be null.
        public Node(T data) {
            this.data = data;
            next = null;
        }

    }

    // Properties of the Singly Linked List class.
    // The three properties should be:
    // 1. size (records the number of nodes in our Singly Linked List)
    // 2. head (a reference to the first (also known as the head) node in our Singly Linked List).
    // 3. tail (a reference to the last (also known as the tail) node in our Singly Linked List.
    private int size = 0;
    private Node<T> head;
    private Node<T> tail;

    // Constructor.
    // Creates a Singly Linked List with a head node.
    public SinglyLinkedList(T value) {
        size = 1;
        head = new Node<>(value);
        tail = head;
    }

    // Methods

    // size
    // returns the size of the Singly Linked List.
    public int size() {
        return size;
    }

    // isEmpty
    // returns whether the Singly Linked List is empty.
    public boolean isEmpty() {
        return size == 0;
    }

    // peekFirst
    // returns the data stored in the head node.
    // throws a run time exception if the Singly Linked List is empty.
    public T peekFirst() {
        if (isEmpty()) throw new RuntimeException("SinglyLinkedList is empty!");
        return head.data;
    }

    // peekLast
    // returns the data stored in the tail node.
    // throws a run time exception if the Singly Linked List is empty.
    public T peekLast() {
        if (isEmpty()) throw new RuntimeException("SinglyLinkedList is empty!");
        return tail.data;
    }

    // addFirst
    // Adds a node to the front of the Singly Linked List.
    public void addFirst(T value) {
        Node<T> first = new Node<>(value);
        first.next = head;
        head = first;
        size++;
        if (size == 1) tail = first;
    }

    // addLast
    // Adds a node to the back of the Singly Linked List.
    public void addLast(T value) {
        Node<T> last = new Node<>(value);
        if (tail == null) {
            tail = last;
            head = last;
            size++;
            return;
        }
        tail.next = last;
        tail = last;
        size++;
        if (size == 1) head = last;
    }

    // insertAt
    // Inserts a node at a specific index.
    // If the index is equal to 0, then we can invoke the addFirst method.
    // If the index is equal to size, then we can invoke the addLast method.
    // throws an illegal argument exception if the index is invalid.
    public void insert(T value, int index) {
        if (index > size) throw new IllegalArgumentException("Index is out of bounds!");
        if (index == 0) addFirst(value);
        else if (index == size) addLast(value);
        else {
            Node<T> traversal = head;
            Node<T> inserted = new Node<>(value);
            for (int i = 1; i < index; i++) {
                traversal = traversal.next;
            }
            inserted.next = traversal.next;
            traversal.next = inserted;
            size++;
        }
    }

    // removeFirst
    // Removes the first (also known as the head node) from the Singly Linked List.
    // Throws a run time exception if the Singly Linked List is empty.
    // Returns the data stored in the head node.
    // If the size of the Singly Linked List becomes 0, need to set the tail to null.
    public T removeFirst() {
        if (isEmpty()) throw new RuntimeException("SinglyLinkedList is empty!");
        T removed = head.data;
        head = head.next;
        size--;
        if (size == 0) {
            head = null;
            tail = null;
        }
        return removed;
    }

    // removeLast
    // Removes the last (also known as the tail node) from the Singly Linked List.
    // Throws a run time exception if the Singly Linked List is empty.
    // Returns the data stored in the tail node.
    // If the size of the Singly Linked List becomes 0, need to set the tail to null.
    public T removeLast() {
        if (isEmpty()) throw new RuntimeException("SinglyLinkedList is empty!");
        if (size == 1) return removeFirst();
        else {
            T removed = tail.data;
            Node<T> traversal = head;
            while (traversal.next != tail) {
                traversal = traversal.next;
            }
            tail = traversal;
            traversal.next = null;
            size--;
            return removed;
        }
    }

    // removeAt
    // Removes a node at a specific index.
    // Returns the data stored in the removed node.
    // If the index is equal to 0, then we can invoke the removeFirst method.
    // If the index is equal to size-1, then we can invoke the removeLast method.
    // throws an illegal argument exception if the index is invalid.

    public T removeAt(int index) {
        if (index >= size || index < 0) throw new IllegalArgumentException("Index is out of bounds!");
        if (index == 0) return removeFirst();
        if (index == size-1) return removeLast();
        Node<T> traversal = head;
        Node<T> previous = null;
        int i = 0;
        while (i < index) {
            previous = traversal;
            traversal = traversal.next;
            i++;
        }
        T data = traversal.data;
        previous.next = traversal.next;
        size--;
        return data;
    }

    // contains
    // Determines whether the Singly Linked List contains a node that holds data equivalent to the value passed.
    // Returns a boolean.
    public boolean contains(T value) {
        Node<T> traversal = head;
        if (traversal.data.equals(value)) return true;
        while (traversal.next != null) {
            traversal = traversal.next;
            if (traversal.data.equals(value)) return true;
        }
        return false;
    }

    // valueAt
    // Returns the data held in the node at a specified index.
    // Throws an illegal argument exception if the index is invalid.
    public T valueAt(int index) {
        if (index >= size) throw new IllegalArgumentException("Index is out of bounds!");
        int i = 0;
        Node<T> traversal = head;
        while (i++ != index) traversal = traversal.next;
        return traversal.data;
    }

    // reverse
    // Reverses the Singly Linked List.
    public void reverse() {
        if (head == null) return;
        Node<T> previous = null;
        Node<T> current = head;
        while (current != null) {
            Node<T> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    // toString
    // Returns a String representation of the Singly Linked List.
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<T> traversal = head;
        while (traversal != null) {
            stringBuilder.append(traversal.data);
            stringBuilder.append(" -> ");
            traversal = traversal.next;
        }
        stringBuilder.append("null");
        return stringBuilder.toString();
    }
}
