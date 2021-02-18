package DataStructureInterfaces;

import java.util.*;

public interface List<E> {
    /**
     * Returns the number of elements in this list. If this list contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
     * @return Returns number of elements in the list
     */
    int size();
    /**
     * Returns true if this list contains no elements.
     * @return true if list contains no elements.
     */
    boolean isEmpty();

    /**
     * Returns true if this list contains the specified element.
     * More formally, returns true if and only if this list contains
     * at least one element e such that (o==null ? e==null : o.equals(e)).
     * @param var1 element whose presence in the list is to be tested
     * @return true if this list contains the specified element
     */
    boolean contains(Object var1);

    /**
     * Appends the specified element to the end of this list (optional operation).
     * @param var1 element
     * @return true
     */
    boolean add(E var1);

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present (optional operation). If this list does not contain the element, it is unchanged.
     * More formally, removes the element with the lowest index i such that (o==null ? get(i)==null : o.equals(get(i)))
     * (if such an element exists).
     * @param var1 Element to be added
     * @return Returns true if this list contained the specified element (or equivalently, if this list changed as a result of the call).
     */
    boolean remove(Object var1);

    /**
     * Removes all of the elements from this list (optional operation). The list will be empty after this call returns.
     */
    void clear();

    /**
     * Compares the specified object with this list for equality.
     * @param var1 Object to be compared
     * @return Returns true if and only if the specified object is also a list, both lists have the same size,
     * and all corresponding pairs of elements in the two lists are equal.
     * (Two elements e1 and e2 are equal if (e1==null ? e2==null : e1.equals(e2)).) In other words,
     * two lists are defined to be equal if they contain the same elements in the same order.
     * This definition ensures that the equals method works properly across different implementations of the DataStructureInterfaces.List interface.
     */
    boolean equals(Object var1);

    /**
     * Returns the element at the specified position in this list.
     * @param var1 index of the element to return
     * @return the element at the specified position in this list
     */
    E get(int var1);

    /**
     * Removes the element at the specified position in this list (optional operation).
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     * @param var1 index of the element to be removed
     * @return Returns the element that was removed from the list.
     */

    E remove(int var1);


}
