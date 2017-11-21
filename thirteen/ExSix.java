package com.wzh.thik.in.java.thirteen;/**
 * Created by Administrator on 2017/11/21.
 */

import java.util.Locale;

import static java.lang.String.format;

/**
 * @author:Administrator
 * @date:2017/11/21
 * @description:
 */
class DataHolder  { int intField = 1; long longField = 2L;
    float floatField = 3.0f; double doubleField = 4.0;
    @Override
    public String toString() {
        StringBuilder result =
                new StringBuilder("DataHolder: \n");
        result.append(
                format(Locale.US, "intField: %d\n", intField));
        result.append(
                format(Locale.US, "longField: %d\n", longField));
        result.append(
                format(Locale.US, "floatField: %f\n", floatField));
        result.append(
                format(Locale.US, "doubleField: %e\n", doubleField));
        return result.toString();
    }
}

public class ExSix {
    public static void main(String[] args) {
        System.out.println(new DataHolder());
    }
}
