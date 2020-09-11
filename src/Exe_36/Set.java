package Exe_36;


public class Set<T> {

    private Object set[];
    private int index;
    private int capacity;


    private int initArraySize = 2;

    public Set() {
        set = new Object[initArraySize];
        index = 0;
        capacity = initArraySize;
    }

    public void add(Object element) {

        if (index == capacity) {
            doubleCapacity();
        }
        if (!contains(element)) {
            set[index] = element;
            index++;
        }
    }

    public boolean contains(Object element) {
        boolean isContains = false;

        if(!(element instanceof String)) {
        for (int i = 0; i < index; i++)
            if (set[i] == element) {
                isContains = true;
                break;
            }
        }else {
            for (int i = 0; i < index; i++)
                if (set[i].equals(element)) {
                    isContains = true;
                    break;
                }
        }

        return isContains;
    }

    public void doubleCapacity() {
        Object temp[] = new Object[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            temp[i] = set[i];
        }
        set = temp;
        capacity = capacity * 2;
    }

    public int size() {
        return index;
    }

    @Override
    public String toString() {
        
        String resultStirng = "{";
        
        for(int i=0; i < index; i++)
            resultStirng += set[i] + " ";
        
        return resultStirng+"}";
    }
    
    

}
