package DataStructureInterfaces;

public interface Queue<E> {
    /**
     * Inserts the specified element into this queue if it is possible to do so
     * immediately without violating capacity restrictions,
     * returning true upon success
     * @param var1 element
     * @return true if added false if failed
     */
    boolean offer(E var1);

    /**
     * Retrieves and removes the head of this queue.
     * @return Returns the head of the queue
     */
    E remove();

    /**
     * Retrieves and removes the head of this queue, or returns null if this queue is empty.
     * @return returns the head of the queue
     */
    E poll();

    /**
     * Retrieves, but does not remove, the head of this queue.Retrieves, but does not remove, the head of this queue.
     * @return returns the head of the queue
     */

    E element();

    /**
     * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     * @return head of the queue or null if empty
     */
    E peek();
}
