package com.yue;

/**
 * @author : Mr.Huang
 * @date : 2019/7/17 9:37
 */
public class ShuZu {
    private int[] data;
    private int size;
    private int capacity;
    public ShuZu(int capacity) {
        data = new int[capacity];
    }
    public ShuZu() {
        this(10);
    }

    public int[] getData() {
        return data;
    }
    public void setData(int[] data) {
        this.data = data;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getCapacity() {
        return capacity=data.length;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    //判断是否为空
    public boolean isEmpty() {
        return size==0;
    }
    //添加
    public void addFirst(int e) {
        add(0,e);
    }
    public void addLast(int e) {
        add(size, e);
    }
    public void add(int index,int e) {
        if(index<0 || index>size) {
            throw new IllegalArgumentException("失败");
        }

        //这里只是说明原理，数组是不支持自动扩容的
        if(size==data.length) {
            resize(new int[data.length*2]);
        }
        for (int i = size-1; i >= index; i--) {
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }
    //这里只是说明原理，数组是不支持自动扩容的
    //扩容
    public void resize(int[] dataNew) {
        for (int i = 0; i < data.length; i++) {
            dataNew[i] = data[i];
        }
        data = dataNew;
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
