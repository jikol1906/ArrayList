import Exception.MyArrayOutOfBoundsException;

/**
 * Created by borisgrunwald on 13/09/2016.
 */
public class  MyArrayList<T> implements MyQueue<T>{

    private T[] arr;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public MyArrayList() {

        this(DEFAULT_CAPACITY);

    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int capacity) {

        if(capacity < 0) {
            throw new IllegalArgumentException("Capacity:" + capacity);
        }

        this.arr = (T[]) new Object[capacity];
        this.size = 0;

    }

    public int indexOf(T data) {

        for(int i = 0; i < size; i++) {
            if(arr[i].equals(data)) {
                return i;
            }
        }

        return -1;

    }

    public boolean contains(T data) {
        return (indexOf(data) > 0);
    }

    public void remove(int index) {

        for(int i = index; i < size-1; i++) {
            arr[i] = arr[i+1];
        }

        arr[size-1] = null;
        size--;


    }

    public void add(T data) {

        checkCapacity(size+1);

        arr[size++] = data;

    }

    public void add(T data, int index) {

        canAddAtIndex(index);

        for(int i = size; i >= index+1; i--) {
            arr[i] = arr[i-1];
        }

        arr[index] = data;
        size++;

    }

    public T get(int index) throws MyArrayOutOfBoundsException {

        checkIndex(index);

        return arr[index];

    }

    public void set(T data, int index) throws MyArrayOutOfBoundsException {

        checkIndex(index);
        arr[index] = data;

    }

    public int size() {

        return size;

    }

    public void clear() {
        size = 0;
    }

    private void checkIndex(int index) throws MyArrayOutOfBoundsException {

        if(index < 0 || index >= size) {
            throw new MyArrayOutOfBoundsException("Index: " + index);
        }

    }

    private void canAddAtIndex(int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }

    @SuppressWarnings("unchecked")
    private void checkCapacity(int capacity) {

        if(capacity > arr.length) {
            int newCapacity = arr.length * 2 + 1;
            if(capacity > newCapacity) {
                newCapacity = capacity;
            }

           T[] newArr = (T[]) new Object[newCapacity];

            for(int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;



        }






    }

    private void reduce() {

        if(size < arr.length - arr.length/2 && arr.length != DEFAULT_CAPACITY) {

            T[] newArray = (T[]) new Object[arr.length - arr.length/2/2];

            for(int i = 0; i < newArray.length; i++) {
                newArray[i] = arr[i];
            }

            arr = newArray;

        }

    }

    public String toString(){

        if(size == 0) {
            return "[]";
        }

        String toReturn = "[" + arr[0];

        for(int i = 1; i <= size - 2; i++) {
            toReturn += ", " + arr[i];
        }

        toReturn += ", " + arr[size - 1] + "]";

        return toReturn;
    }

    //Queue

    public T remove() {

        T temp = arr[size-1];
        remove(size-1);
        return temp;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T peek() throws MyArrayOutOfBoundsException {
        return this.get(size-1);
    }



}

