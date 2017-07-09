/**
 * Created by cdxu0 on 2017/7/8.
 */
public interface MySet<E> extends Iterable<E> {
    //remove all the elements in the set
    public void clear();
    //return true if element in the set
    public boolean contains(E e);
    //add the element to the set, return true if success
    public boolean add(E e);
    //remove the element from the set,return true if the element in the set
    public boolean remove(E e);
    //return true if set is empty
    public boolean isEmpty();
    //return the size of the set
    public int size();
}
