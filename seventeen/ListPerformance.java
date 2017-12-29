package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/28.
 */
import java.util.*;
/**
 * @author:Administrator
 * @date:2017/12/28
 * @description:
 */

public class ListPerformance {
    static Random rand =  new Random();
    static int reps = 1000;
    static List<Test<List<Integer>>> tests =
            new ArrayList<>();
    static List<Test<LinkedList<Integer>>> qTests =
            new ArrayList<>();
    static {
        tests.add(new Test<List<Integer>>("add") {
            @Override
            int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                for (int i = 0; i < loops; i++){
                    list.clear();
                    for(int j =0; j < listSize; j++){
                        list.add(j);
                    }
                }
                return loops * listSize;
            }
        });
    }
}
