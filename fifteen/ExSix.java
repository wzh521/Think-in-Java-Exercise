package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/29.
 */


import com.wzh.thik.in.java.eleven.Generator;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/11/29
 * @description:
 */
class RandomList<T>{
    private ArrayList<T> storage = new ArrayList<T>();
    private Random random = new Random(47);
    public void add(T item){
        storage.add(item);
    }
    public T select(){
        return storage.get(random.nextInt(storage.size()));
    }
}
public class ExSix {
    private static void dump(RandomList rl) {
        for(int i = 0; i < 11; i++)
        System.out.print(rl.select() + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for(String s: ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" "))
        {rs.add(s);}
        dump(rs);
        RandomList<Integer> ri = new RandomList<Integer>();

        for(int i = 0; i < 11; i ++)
        { ri.add(i);}
        dump(ri);

    }

}
