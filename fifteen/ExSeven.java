package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/29.
 */

import com.wzh.thik.in.java.eleven.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * @author:Administrator
 * @date:2017/11/29
 * @description:
 */
class Coffee{
    private static long counter=0;
    private final long id=counter++;
    @Override
    public String toString(){
        return getClass().getSimpleName()+" "+id;
    }
}
class Latte extends Coffee{}
class Mocha extends Coffee{}
class Cappuccino extends Coffee{}
class Americano extends Coffee{}
class Breve extends Coffee{}
class CoffeeGenerator implements
        Generator<Coffee>,Iterable<Coffee>{

    private Class[] types={Latte.class,Mocha.class,Cappuccino.class,
        Americano.class,Breve.class};
    private Random random=new Random(47);
    public CoffeeGenerator(){}
    private int size=0;
    public CoffeeGenerator(int size){
        this.size=size;
    }
    @Override
    public Coffee next() {
        try{
            return (Coffee)types[random.nextInt(types.length)].newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    class CoffeeIterator implements Iterator<Coffee>{
        int count=size;
        @Override
        public boolean hasNext() {
            return count>0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
        @Override
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator coffees = new CoffeeGenerator();
        for(int i=0; i<5; i++){
            System.out.println(coffees.next());
        }
        for(Coffee coffee : new CoffeeGenerator(5)){
            System.out.println(coffee);
        }
    }
}
class Fibonacci implements Generator<Integer>{
    private int count = 0;
    @Override
    public Integer next() {
        return fib(count++);
    }
    private int fib(int n){
        if(n<2){ return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}
class IterableFibonacci implements Iterable<Integer>{
    private Fibonacci fibonacci = new Fibonacci();
    private int n;
    public IterableFibonacci(int n){
        this.n=n;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int count =n;
            @Override
            public boolean hasNext() {
                return count>0;
            }

            @Override
            public Integer next() {
                count--;
                return fibonacci.next();
            }
            @Override
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
}
public class ExSeven {
    public static void main(String[] args) {
        for(Integer integer : new IterableFibonacci(5)){
            System.out.println(integer);
        }
    }
}
