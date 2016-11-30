import Exception.MyArrayOutOfBoundsException;

/**
 * Created by borisgrunwald on 26/09/2016.
 */
public interface MyQueue<E> {

    public void add(E data);

    public E remove();

    public boolean isEmpty();

    public E peek () throws MyArrayOutOfBoundsException;

    public int size();

}
