package com.yue;

/**
 * @author : Mr.Huang
 * @date : 2019/7/17 10:38
 */
public class ArrayLRU {
    private int[] data;
    /**
     * 传的是大小
     */
    private int size;
    private int capacity;

    public ArrayLRU(int capacity) {
        data = new int[capacity];
    }
    public ArrayLRU() {
        this(10);
    }
    public void add(int e) {
        if (size ==0) {
            data[0] = e;
            size++;
            return;
        }
        //获取到exist判断插入的数据是否存在在数组中
        boolean exist = false;
        for (int i = 0; i < size; i++) {
            if (e == data[i]) {
                exist = true;
                break;
            }
        }
        //不存在
        if (!exist) {
            //内存未满
            if (size < data.length) {
                data[size] = e;
                size++;
            }else {
                for (int i = 0; i < size-1; i++) {
                    data[i] = data[i+1];
                }
                data[size-1] = e;
            }
        }else {
            //存在
            int markIndex = 0;
            for (int i = 0; i < size-1; i++) {
                if (e == data[i]) {
                    markIndex = i;
                    break;
                }
            }
            for (int j = markIndex; j < size-1; j++) {
                data[j] = data[j+1];
            }
            data[size-1] = e;
        }
    }

    @Override
    public String toString() {
        StringBuffer bf = new StringBuffer();
        bf.append('[');
        for (int i = 0; i < size; i++) {
            bf.append(data[i]);
            if(i != size-1) {
                bf.append(',');
            }
        }
        bf.append(']');
        return bf.toString();
    }
}
