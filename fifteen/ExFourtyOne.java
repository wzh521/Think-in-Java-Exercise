package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/3.
 */

import com.wzh.thik.in.java.eleven.Generator;

import java.util.*;

/**
 * @author:Administrator
 * @date:2017/12/3
 * @description:
 */
interface Addable<T>{
    void add(T t);
}
class Fill2{
    public static <T> void fill(Addable<T> addable,
                                Class<?extends T>classToken,int size){
        for(int i=0; i<size;i++){
            try {
                addable.add(classToken.newInstance());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static <T> void fill (Addable<T> addable,
                                 Generator<T> generator,int size){
        for(int i=0; i<size; i++){
            addable.add(generator.next());
        }
    }
}
class AddableCollectionAdapter<T> implements Addable<T>{
    private Collection<T> c;
    public AddableCollectionAdapter(Collection<T> c){
        this.c=c;
    }
    @Override
    public void add(T t) {
        c.add(t);
    }
}
class SimpleQueue<T>implements Iterable<T>{
    private LinkedList<T> storage=new LinkedList<T>();
    public void add(T t){
        storage.offer(t);
    }
    public T get(){
        return storage.poll();
    }
    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }
}
class Adapter{
    public static<T>
    Addable<T>  collectionAdapter(Collection<T> c){
        return new AddableCollectionAdapter<T>(c);
    }
}
class AddableSimpleQueue<T>
extends SimpleQueue<T> implements Addable<T>{
    @Override
    public void add(T item){
        super.add(item);
    }
}
public class ExFourtyOne {
    public static void main(String[] args) {
        List<Coffee>carrier=new ArrayList<>();
        Fill2.fill(new AddableCollectionAdapter<Coffee>(carrier),
                Coffee.class,3);
        Fill2.fill(Adapter.collectionAdapter(carrier),
                Latte.class,2);
        for(Coffee c:carrier){
            System.out.println(c);
        }
        AddableSimpleQueue <Coffee> coffees=
                new AddableSimpleQueue<>();
        Fill2.fill(coffees,Mocha.class,4);
        Fill2.fill(coffees,Latte.class,1);
        for(Coffee c:coffees){
            System.out.println(c);
        }

    }
}
