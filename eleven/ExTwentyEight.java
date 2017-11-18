package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/18.
 */

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/11/18
 * @description:
 */

public class ExTwentyEight {
    public static void main(String[] args) {
        Random random = new Random(47);
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        for(int i=0; i<5; i++){
            priorityQueue.offer(random.nextDouble());
        }
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());

        }
    }
}
