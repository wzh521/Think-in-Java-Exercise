package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/29.
 */

import com.wzh.thik.in.java.eleven.Generator;

import java.util.Comparator;

/**
 * @author:Administrator
 * @date:2017/12/29
 * @description:
 */
class TwoString implements  Comparable<TwoString>{
    String s1, s2;
    public TwoString(String s1i, String s2i) { s1 = s1i;
        s2 = s2i;
    }
    public String toString() {
        return "[s1 = " + s1 + ", s2 = " + s2 + "]";
    }
    @Override
    public int compareTo(TwoString rv) { String rvi = rv.s1;
        return s1.compareTo(rvi);
    }
//    private static RandomGenerator.String gen = new RandomGenerator.String();
//    public static Generator<TwoString> generator() {
//        return new Generator<TwoString>() {
//        public TwoString next() {
//            return new TwoString(gen.next(), gen.next());
//        }
//    };
    }


class CompareSecond implements Comparator<TwoString> {
    public int compare(TwoString sc1, TwoString sc2) {
    return sc1.s2.compareTo(sc2.s2);
}
}

public class ExFourty {
//    public static void main(String[] args) {
//        TwoString[] array = new TwoString[10]; Generated.array(array, TwoString.generator()); print("before sorting, array = " +
//                Arrays.asList(array)); Arrays.sort(array);
//        print("\nafter sorting, array = " + Arrays.asList(array));
//        Arrays.sort(array, new CompareSecond()); print(
//                "\nafter sorting with CompareSecond, array = " + Arrays.asList(array));
//        ArrayList<TwoString> list = new ArrayList<TwoString>( CollectionData.list(TwoString.generator(), 10));
//        TwoString zeroth = list.get(0); print("\nbefore sorting, list = " + list); Collections.sort(list);
//        print("\nafter sorting, list = " + list); Comparator<TwoString> comp = new CompareSecond(); Collections.sort(list, comp);
//        print(
//                "\nafter sorting with CompareSecond, list = "
//                        + list); int index =
//                Collections.binarySearch(list, zeroth, comp);
//
//
//        print("\nFormer zeroth element " + zeroth + " now located at " + index);
//    }

}

