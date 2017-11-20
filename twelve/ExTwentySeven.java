package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */

public class ExTwentySeven {
    public static void main(String[] args) {
        char[] array = new char[10]; try {
            array[10] = 'x';
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}
