/*
BRAYDEN COGHILL
300347436
 */

import java.util.ArrayList;

/**
 * A flawed implementation of a SET of objects of a generic type T.
 * A SET is a collection of items which does not contain any duplicated entries.
 *
 * @param <T>
 */
public class GoodSet<T> {

    /**
     * The elements of this set will be contained in this ArrayList.
     */
    private ArrayList<T> elements;

    /**
     * A no-arg constructor
     */
    public GoodSet() {
        elements = new ArrayList<>();
    }

    /**
     * Adds the given element t to this set
     *
     * @param t
     */
    public void add(T t) {
        if (!elements.contains(t)){
            elements.add(t);
        }
    }

    /**
     * Checks if element t is in this set
     *
     * @param t
     * @return true if t is in the set
     */
    public boolean contains(T t) {
        return elements.contains(t);
    }

    /**
     * Removes element t in this set, if it exists
     *
     * @param t
     * @return true if the element was found and removed. False if the element was not found
     */
    public boolean remove(T t) {
        return elements.remove(t);
    }

    /**
     * The number of elements in this set
     *
     * @return the number of elements in this set
     */
    public int size() {
        return elements.size();
    }

    /**
     * Returns a string
     *
     * @return a string
     */
    public String toString() {
        return elements.toString();
    }

}
