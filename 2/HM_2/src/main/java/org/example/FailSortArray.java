package org.example;

public class FailSortArray {
    private int [] array;
    private int errval;

    public int length;

    public FailSortArray(int size, int errv) {
        array = new int[size];
        errval = errv;
        length = size;
    }

    public int get(int index) {
        if (indexOK(index)) return array[index];

        return  errval;
    }

    public boolean put(int index, int val) {
        if(indexOK(index)) {
            array[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;

        return false;
    }

}
