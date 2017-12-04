package com.wzh.thik.in.java.sixteen;/**
 * Created by Administrator on 2017/12/4.
 */

import java.util.Arrays;

/**
 * @author:Administrator
 * @date:2017/12/4
 * @description:
 */
class DataHolder {
    protected int data;
    DataHolder(int data) { this.data = data; }
}

class DataHolderWithEquals extends DataHolder {
    DataHolderWithEquals(int data) {
        super(data); }
    @Override
    public boolean equals(Object o) {
    return o instanceof DataHolderWithEquals && data == ((DataHolder)o).data;
}
}
public class ExNineteen {
    public static void main(String[] args) {
        DataHolder[] a1 = new DataHolder[5];
        DataHolder[] a2 = new DataHolder[5];
        Arrays.fill(a1, new DataHolder(1));
        Arrays.fill(a2, new DataHolder(1));
        System.out.println(Arrays.equals(a1, a2));
        Arrays.fill(a1, new DataHolderWithEquals(1));
        Arrays.fill(a2, new DataHolderWithEquals(1));
        System.out.println(Arrays.equals(a1, a2));
    }
}
