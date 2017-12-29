package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/28.
 */
import com.wzh.thik.in.java.sixteen.CollectionData;

import java.util.*;
/**
 * @author:Administrator
 * @date:2017/12/28
 * @description:
 */

public class ExThirty {
    static List<Test<List<Integer>>> tests = new ArrayList<Test<List<Integer>>>();

    static {
        tests.add(new Test<List<Integer>>("sort") {
            int test(List<Integer> list, TestParam tp) {
                for (int i = 0; i < tp.loops; i++) {
                    list.clear();
//                list.addAll(CollectionData.list(
//                    new RandomGenerator.Integer(), tp.size));
                    Collections.sort(list);
                }
                return tp.loops;
            }
        });


    }


    static class ListTester extends Tester<List<Integer>> {
        public ListTester(List<Integer> container,
                          List<Test<List<Integer>>> tests) {
            super(container, tests);
        }

        @Override
        protected List<Integer> initialize(int size) {
            container.clear();
//            container.addAll(CollectionData.list(
//                    new RandomGenerator.Integer(), size));
            return container;
        }

        public static void run(List<Integer> list, List<Test<List<Integer>>> tests) {
            new ListTester(list, tests).timedTest();
        }
    }

    public static void main(String[] args) {
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        ListTester.run(new ArrayList<Integer>(), tests);
        ListTester.run(new LinkedList<Integer>(), tests);
    }
}

