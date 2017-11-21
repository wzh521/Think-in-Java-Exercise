package com.wzh.thik.in.java.thirteen;/**
 * Created by Administrator on 2017/11/21.
 */

import java.util.Locale;
import java.util.Scanner;

/**
 * @author:Administrator
 * @date:2017/11/21
 * @description:
 */
class DataHolder2 { private int i; private long l; private float f; private double d; private String s;


    DataHolder2(String data) {
        Scanner stdin = new Scanner(data); stdin.useLocale(Locale.US);
        i =  stdin.nextInt(); l = stdin.nextLong(); f = stdin.nextFloat();
        d = stdin.nextDouble(); s = stdin.next("\\w+");
    }
    @Override
    public String toString() {
        return i + " " + l + " " + f + " " + d + " " + s;
    }
}
public class ExTwenty {
    public static void main(String[] args) {
        DataHolder2 dh =
                new DataHolder2("1 10000000000000 1.1 1e55 Howdy Hi");
        System.out.println(dh.toString());
    }
}
