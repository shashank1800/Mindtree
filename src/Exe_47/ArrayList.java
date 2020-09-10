package Exe_47;

import java.util.Iterator;

public class ArrayList<T> implements Iterable<T>{
    
    private Object array[];
    private int index;
    private int capacity;

    private int initArraySize = 2;

    public ArrayList() {
        array = new Object[initArraySize];
        index = 0;
        capacity = initArraySize;
    }

    public void add(Object element) {

        if (index == capacity) {
            doubleCapacity();
        }
        array[index] = element;
        index++;
    }

    public void add(int position, Object element) {
        if (index == capacity) {
            doubleCapacity();
        }

        for (int i = index - 1; i >= position; i--) {
            array[i + 1] = array[i];
        }

        array[position] = element;
        index++;
    }

    public T get(int index) {
        return (T) array[index];
    }
    
    public void set(int i, Object element) {
        array[i] = element;
    }

    public void remove(int index) {
        if (index >= index || index < 0) {
            new ArrayIndexOutOfBoundsException("Message is from Generic ArrayList");
        } else {
            for (int i = index; i < index - 1; i++) {
                array[i] = array[i + 1];
            }
            array[index - 1] = null;
            index--;
        }
    }

    public void doubleCapacity() {
        Object temp[] = new Object[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            temp[i] = array[i];
        }
        array = temp;
        capacity = capacity * 2;
    }

    public int size() {
        return index;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < index && array[currentIndex] != null;
            }

            @Override
            public T next() {
                return (T) array[currentIndex++];
            }
        };
        return it;
    }
}
