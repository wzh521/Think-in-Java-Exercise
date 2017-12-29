package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/18.
 */

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/12/18
 * @description:
 */
class Item implements Comparable<Item>{
    private Random random = new Random();
    private Integer priority = random.nextInt(101);

    @Override
    public int compareTo(Item o) {
        return priority < o.priority ? -1 :
                priority == o.priority? 0 : 1;

    }
    @Override
    public String toString() {
        return Integer.toString(priority);
    }

}
public class ExEleven {
    public static void main(String[] args) {
        PriorityQueue<Item> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 5; i++){
            priorityQueue.add(new Item());
        }
        Item item;
        while((item = priorityQueue.poll()) != null)


            System.out.println(item);
    }

}


