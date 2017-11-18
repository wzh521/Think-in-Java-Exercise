package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/17.
 */

import java.util.*;

/**
 * @author:Administrator
 * @date:2017/11/17
 * @description:
 */

class MoviesNameGenerator implements Generator<String>{
    String[] characters = {
            "Grumpy", "Happy", "Sleepy", "Dopey", "Doc", "Sneezy", "Bashful", "Snow White", "Witch Queen", "Prince"
    };
    int next;


    @Override
    public String next() {
        String r = characters[next];
        next = (next + 1) % characters.length;
        return r;
    }
}
public class ExFour {
    private static final MoviesNameGenerator msg = new MoviesNameGenerator();
    static String[] fill(String[] array) {
        for(int i = 0; i < array.length; i++){
        array[i] = msg.next();
        }
        return array;
    }
    static Collection<String> fill(Collection<String> collection) {
        for(int i = 0; i < 5; i++) {
            collection.add(msg.next());
        }
            return collection;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fill(new String[5])));
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>())); 
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
    }
}
