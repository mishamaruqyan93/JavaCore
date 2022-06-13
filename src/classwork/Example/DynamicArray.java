package classwork.Example;

public class DynamicArray {
    private int[] array;
    private int size;

    public DynamicArray() {
        array = new int[10];
        size = 0;
    }

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    public void add(int index, int value) {
        if (!check(index)) {
            if (size == array.length) {
                extend();
            }
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            size++;
        } else {
            System.out.println("IndexOutOfBoundsException");
        }
    }

    public int getByIndex(int index) {
        if (!check(index)) {
            return array[index];
        }
        return -1;
    }

    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void set(int index, int value) {
        if (!check(index)) {
            array[index] = value;
        } else {
            System.out.println("IndexOutOfBoundsException");
        }
    }

    public void delete(int index) {
        if (!check(index)) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else {
            System.out.println("IndexOutOfBoundsException");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private boolean check(int index) {
        return index >= size || index<0;
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
}