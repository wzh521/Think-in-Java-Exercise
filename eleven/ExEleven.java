package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/18.
 */

import java.util.*;

/**
 * @author:Administrator
 * @date:2017/11/18
 * @description:
 */

public class ExEleven {
    private static void display(Iterator<?> it){
        while(it.hasNext()){

            System.out.println(it.next().toString());
        }

    }

    public static void main(String[] args) {
        List<Collection<String>> ca =
                Arrays.<Collection<String>>asList( new ArrayList<String>(),
                        new LinkedList<String>(), new HashSet<String>(), new TreeSet<String>());
        for(Collection<String> c : ca){
            ExFour.fill(c);
        }
        for(Collection<String> c : ca) {
            display(c.iterator());
        }
    }
}
