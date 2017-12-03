package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/30.
 */

import com.wzh.thik.in.java.eleven.Generator;

import java.util.*;

/**
 * @author:Administrator
 * @date:2017/11/30
 * @description:
 */
class Generators{
    public static <T> Collection<T> fill(Collection<T> collection , Generator<T> gen,int n){
        for(int i=0; i<n; i++){
            collection.add(gen.next());

        }
        return collection;
    }
    public static <T> List<T>
    fill(List<T> list, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++) {
            list.add(gen.next());
        }
        return list;
    }
    public static <T> Queue<T>
    fill(Queue<T> queue, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++) {
            queue.add(gen.next());
        }
        return queue;
    }
    public static <T> LinkedList<T>
    fill(LinkedList<T> llist, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++) {
            llist.add(gen.next());
        }
        return llist;
    }
    public static <T> Set<T>
    fill(Set<T> set, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++) {
            set.add(gen.next());
        }
        return set;
    }

}
public class ExThirteen {
    public static void main(String[] args) {
        Collection<Coffee> coffees = Generators.fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
        for(Coffee c :coffees){
            System.out.println(c);
        }
        List<Coffee> coffeeList = Generators.fill(
                new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for(Coffee c : coffeeList)
            System.out.println(c);
        Queue<Integer> iQueue =Generators.fill(
                (Queue<Integer>)new LinkedList<Integer>(), new Fibonacci(), 12);
        for(int i : iQueue)
            System.out.print(i + " ");
        System.out.println();

    }

}
