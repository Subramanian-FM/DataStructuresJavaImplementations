package DataStructureInterfaces;

public interface Map<K,V> {
    /**
     * @return Returns number of key-value mappings in the map
     */
    int size();

    /**
     *
     * @return true if map is contains no key-value mappings
     */
    boolean isEmpty();

    /**
     * @param var1 Key to be checked
     * @return Returns true if this map contains a mapping for the specified key.
     */

    boolean containsKey(Object var1);
    /**
     * @param var1 value to be checked
     * @return Returns true if this map contains a mapping for the specified value.
     */
    boolean containsValue(Object var1);

    /**
     * @param var1 key of the value
     * @return Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
     */
    V get(Object var1);

    /**
     * Associates the specified value with the specified key in this map (optional operation).
     * @param var1 key
     * @param var2 value
     * @return Returns the associated value
     */
    V put(K var1, V var2);

    /**
     * @param var1 key
     * @return Removes the mapping for a key from this map if it is present (optional operation).
     */

    V remove(Object var1);

    /**
     * Removes all of the mappings from this map (optional operation). The map will be empty after this call returns.
     */

    void clear();
}
