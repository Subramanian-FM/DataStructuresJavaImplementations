package DataStructureInterfaces;

public interface LinkedListFunctions<E> {
    /**
     * Returns true if the LinkedList is rotated successfully.
     * Parameters: int k - number of times the LinkedList is to be rotated. k < sizeOfLinkedList
     *              int size - size of the list
     * @return Returns true if the LinkedList is rotated successfully
     */
    boolean rotate(int k, int size);

    int size();

    boolean add(E var1);

    /**
     * Prints the LinkedList
     */
    void printLinkedList();

    Object get(int var1);
}
