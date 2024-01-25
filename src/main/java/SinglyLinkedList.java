public class SinglyLinkedList<T> {

    // Inner Node class.
    public class Node<T> {
        // Properties of the Node class.
        // The two properties should be:
        // 1. data (the data stored in the node).
        // 2. next (a reference (also known as a pointer) to the next node.


        // Constructor of the Node class.
        // The constructor should set the data property of the Node to be the value passed as a parameter.
        // The constructor should set the next property of the Node to be null.


    }

    // Properties of the Singly Linked List class.
    // The three properties should be:
    // 1. size (records the number of nodes in our Singly Linked List)
    // 2. head (a reference to the first (also known as the head) node in our Singly Linked List).
    // 3. tail (a reference to the last (also known as the tail) node in our Singly Linked List.


    // Constructor.
    // Creates a Singly Linked List with a head node.
    public SinglyLinkedList(T value) {

    }

    // Methods

    // size
    // returns the size of the Singly Linked List.
    public int size() {

        return 0;

    }

    // isEmpty
    // returns whether the Singly Linked List is empty.
    public boolean isEmpty() {

        return false;

    }

    // peekFirst
    // returns the data stored in the head node.
    // throws a run time exception if the Singly Linked List is empty.
    public T peekFirst() {

        return null;

    }

    // peekLast
    // returns the data stored in the tail node.
    // throws a run time exception if the Singly Linked List is empty.
    public T peekLast() {

        return null;

    }

    // addFirst
    // Adds a node to the front of the Singly Linked List.
    public void addFirst(T value) {

    }

    // addLast
    // Adds a node to the back of the Singly Linked List.
    public void addLast(T value) {

    }

    // insertAt
    // Inserts a node at a specific index.
    // If the index is equal to 0, then we can invoke the addFirst method.
    // If the index is equal to size, then we can invoke the addLast method.
    // throws an illegal argument exception if the index is invalid.
    public void insert(T value, int index) {

    }

    // removeFirst
    // Removes the first (also known as the head node) from the Singly Linked List.
    // Throws a run time exception if the Singly Linked List is empty.
    // Returns the data stored in the head node.
    // If the size of the Singly Linked List becomes 0, need to set the tail to null.
    public T removeFirst() {

        return null;

    }

    // removeLast
    // Removes the last (also known as the tail node) from the Singly Linked List.
    // Throws a run time exception if the Singly Linked List is empty.
    // Returns the data stored in the tail node.
    // If the size of the Singly Linked List becomes 0, need to set the tail to null.
    public T removeLast() {

        return null;

    }

    // removeAt
    // Removes a node at a specific index.
    // Returns the data stored in the removed node.
    // If the index is equal to 0, then we can invoke the removeFirst method.
    // If the index is equal to size-1, then we can invoke the removeLast method.
    // throws an illegal argument exception if the index is invalid.

    public T removeAt(int index) {

        return null;

    }

    // contains
    // Determines whether the Singly Linked List contains a node that holds data equivalent to the value passed.
    // Returns a boolean.
    public boolean contains(T value) {

        return false;

    }

    // valueAt
    // Returns the data held in the node at a specified index.
    // Throws an illegal argument exception if the index is invalid.
    public T valueAt(int index) {

        return null;

    }

    // reverse
    // Reverses the Singly Linked List.
    public void reverse() {

    }

    // toString
    // Returns a String representation of the Singly Linked List.
    public String toString() {

        return null;

    }

}
