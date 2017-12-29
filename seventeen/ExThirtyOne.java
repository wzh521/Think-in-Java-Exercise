package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/28.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/12/28
 * @description:
 */
class StringContainer {
    private String[] array;
    private int index;
    private static final int INCR = 255;
    public StringContainer() {
        array = new String[10];
    }
    public StringContainer(int sz) {
        array = new String[sz];
    }
    public void add(String s) {
        if(index >= array.length) {
        String[] tmp = new String[array.length + INCR];
            for(int i = 0; i < array.length; i++)
            tmp[i] = array[i];
            index = array.length;
            array = tmp;
    }
        array[index++] = s;
    }
    public String get(int i) { return array[i]; }
    public int size() { return index; }
}

public class ExThirtyOne {
    static final int LOOPS = 10000;
    static List<Test<List<String>>> alTests = new ArrayList<Test<List<String>>>();
    static List<Test<StringContainer>> scTests = new ArrayList<Test<StringContainer>>();
    static {
        alTests.add(new Test<List<String>>("addget") {
            int test(List<String> list, TestParam tp) {
                for (int i = 0; i < LOOPS; i++) {
                    list.add(Integer.toString(i));
                    list.get(i);
                }
                return LOOPS;
            } });




        scTests.add(new Test<StringContainer>("addget") {
            int test(StringContainer sc, TestParam tp) {
                for (int i = 0; i < LOOPS; i++) {
                    sc.add(Integer.toString(i));
                    sc.get(i);
                }return LOOPS;
            }});

    }


    public static void main(String[] args) {

         Tester.defaultParams = TestParam.array(LOOPS, 1);
        Tester.run(new ArrayList<String>(LOOPS), alTests);
        Tester.run(new StringContainer(LOOPS), scTests);
    }

}
