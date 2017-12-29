package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/28.
 */

/**
 * @author:Administrator
 * @date:2017/12/28
 * @description:
 */

public class TestParam {
    public final int size;
    public final int loops;
    public TestParam(int size , int loops){
        this.size = size;
        this.loops = loops;
    }
    public static TestParam[] array (int... values){
        int size = values.length/2;
        TestParam[] result = new TestParam[size];
        int n = 0;
        for(int i = 0; i < size; i++){
            result[i] = new TestParam(values[n++],values[n++]);

        }
        return result;
    }
    public static TestParam[] array(String[] values){
        int[] vals = new int[values.length];
        for(int i = 0; i < vals.length; i++){
            vals[i] = Integer.decode(values[i]);
        }
        return array(vals);
    }
}
