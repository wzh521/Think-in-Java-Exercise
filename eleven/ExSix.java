package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/17.
 */
import java.util.*;
/**
 * @author:Administrator
 * @date:2017/11/17
 * @description:
 */

public class ExSix {
    static Random rand = new Random(47); public static void main(String[] args) {
        List<String> strs = new ArrayList<String>( Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
        System.out.println("1: " + strs);
        strs.add("H");
        System.out.println("2: " + strs);
        System.out.println("3: " + strs.contains("H")); strs.remove("H");
        String s1 = strs.get(2);
        System.out.println("4: " +	s1 + " " + strs.indexOf(s1)); String s2 = "A";
        System.out.println("5: " + strs.indexOf(s2));
        System.out.println("6: " + strs.remove(s2));
        System.out.println("7: " + strs.remove(s1)); System.out.println("8: " + strs);
        strs.add(3, "0");
        System.out.println("9: " + strs);
        List<String> sub = strs.subList(1, 4); System.out.println("subList: " + sub);
        System.out.println("10: " + strs.containsAll(sub)); Collections.sort(sub);
        System.out.println("sorted subList: " + sub);


        System.out.println("11: " + strs.containsAll(sub)); Collections.shuffle(sub, rand); System.out.println("shuffled subList: " + sub); System.out.println("12: " + strs.containsAll(sub));
        List<String> copy = new ArrayList<String>(strs); sub = Arrays.asList(strs.get(1), strs.get(4)); System.out.println("sub: " + sub);
        copy.retainAll(sub); System.out.println("13: " + copy);
        copy = new ArrayList<String>(strs); copy.remove(2);
        System.out.println("14: " + copy); copy.removeAll(sub); System.out.println("15: " + copy);
        copy.set(1, "I");
        System.out.println("16: " + copy); copy.addAll(2, sub); System.out.println("17: " + copy);
        System.out.println("18: " + strs.isEmpty()); strs.clear();
        System.out.println("19: " + strs); System.out.println("20: " + strs.isEmpty());
        strs.addAll(Arrays.asList("A", "B", "C", "D")); System.out.println("21: " + strs);
        Object[] o = strs.toArray(); System.out.println("22: " + o[3]);
        String[] sa = strs.toArray(new String[0]); System.out.println("22: " + sa[3]);
    }
}
