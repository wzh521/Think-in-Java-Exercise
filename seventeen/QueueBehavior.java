package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/18.
 */
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

import com.wzh.thik.in.java.eleven.Generator;

/**
 * @author:Administrator
 * @date:2017/12/18
 * @description:
 */

public class QueueBehavior {
    private static int count = 10;
    static <T>void test(Queue<T> queue, Generator<T>gen){
        for(int i = 0; i < count; i++ ){
            queue.offer(gen.next());
        }
        while(queue.peek() != null){
            System.out.println(queue.remove() + " ");
        }

    }
    static class Gen implements Generator<String>{
        String[] s =("one two three four five six seven eight nien ten").split(" ");
        int i;
        @Override
        public String next() {
            return s[i++];
        }
    }

    public static void main(String[] args) {
        test(new LinkedList<String>(),new Gen());
        test(new PriorityQueue<String>(),new Gen());
        test(new ArrayBlockingQueue<String>(count),new Gen());
        test(new ConcurrentLinkedDeque<String>(),new Gen());
        test(new LinkedBlockingDeque<String>(),new Gen());
    }
}
class ToDoList extends PriorityQueue<ToDoList.ToDoItem>{
    static class ToDoItem implements Comparable<ToDoItem>{
        private char primary;
        private int secondary;
        private String item;
        public ToDoItem(String td ,char pri,int sec){
            primary = pri;
            secondary = sec;
            item = td;
        }

        @Override
        public int compareTo(ToDoItem arg) {
            if(primary > arg.primary){
                return +1;
            }
            if(primary == arg.primary){
                if(secondary > arg.secondary){
                    return +1;
                }else if (secondary == arg.secondary){
                    return 0;
                }
            }
            return -1;
        }
        @Override
        public String toString(){
            return Character.toString(primary)+ secondary +": "+ item;
        }

    }
    public void add (String td, char pri, int sec){
        super.add(new ToDoItem(td,pri,sec));
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.add("Empty trash" ,'C', 4);
        toDoList.add("Free dog", 'A',2 );
        toDoList.add("Free bird",'B',7);
        toDoList.add("Mow lawn",'C',3);
        toDoList.add("Water lawn",'A',1);
        while(!toDoList.isEmpty()){
            System.out.println(toDoList.remove());
        }
    }
}
