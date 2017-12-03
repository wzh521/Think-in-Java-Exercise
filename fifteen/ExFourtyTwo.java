package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/3.
 */

import com.sun.scenario.effect.impl.prism.PrDrawable;

import java.util.*;

/**
 * @author:Administrator
 * @date:2017/12/3
 * @description:
 */
interface Combiner<T>{
    T combine(T x, T y );
}
interface UnaryFunction<R,T>{
    R function(T x);
}
interface Collector<T> extends UnaryFunction<T,T>{
    T result();
}
interface UnaryPredicate<T>{
    boolean test(T x);
}
class Functional{
    public static <T> T
    reduce(Iterable<T>seq,Combiner<T> combiner){
        Iterator<T> it = seq.iterator();
        if(it.hasNext()){
            T result=it.next();
            while(it.hasNext()){
                result=combiner.combine(result,it.next());

        }
            return result;
        }
        return null;
    }
    public static <T> Collector<T> forEach(Iterable <T> seq,Collector<T> func){
        for(T t:seq){
            func.function(t);
        }
        return func;
    }
    public static <R,T> List<R>
    transform(Iterable<T> seq,UnaryFunction<R,T> func){
        List<R> result = new ArrayList<R>();
        for(T t:seq){
            result.add(func.function(t));
        }
        return result;
    }
    public static <T> List<T> filter(Iterable<T>seq,UnaryPredicate<T> pred){
        List<T> result =new ArrayList<T>();
        for(T t:seq){
            if(pred.test(t)){
                result.add(t);
            }
        }
        return result;
    }
    static class
    GreaterThan<T extends Comparable<T>> implements UnaryPredicate<T>{
        private T bound;
        public GreaterThan(T bound){
            this.bound=bound;
        }
        @Override
        public boolean test(T x) {
            return x.compareTo(bound)>0;
        }
    }

}
final class DataManipulator1
        implements Comparable<DataManipulator1> { private int value;
    public DataManipulator1(int value) { this.value = value; } public void increment() { ++value; }
    public int getValue() { return value; }
    public int compareTo(DataManipulator1 other) {
        return Integer.valueOf(value).compareTo(other.value);
    }
    public String toString()  { return Integer.toString(value);
    }
}

final class DataManipulator2 { private String value;
    public DataManipulator2(String value) { setValue(value); } public void setValue(String value) { this.value = value; } public String getValue() { return value; }
}
public class ExFourtyTwo {
    static class Incrementor implements UnaryFunction<DataManipulator1,DataManipulator1> {
        public DataManipulator1 function(DataManipulator1 x) { x.increment();
            return x;
        }
    }
    static class UpperCaseConverter
            implements UnaryFunction<String,DataManipulator2> { public String function(DataManipulator2 x) {
        return x.getValue().toUpperCase();
    }
    }
    static class Concatenator
            implements Combiner<DataManipulator2> {


        public DataManipulator2
        combine(DataManipulator2 x,DataManipulator2 y) { x.setValue(x.getValue() + y.getValue()); return x;
        }
    }

    public static void main(String[] args) { DataManipulator1 rf = new DataManipulator1(4); List<DataManipulator1> ldm1 = Arrays.asList(
            new DataManipulator1(3), new DataManipulator1(10), new DataManipulator1(1),new DataManipulator1(7));
        System.out.println(
                Functional.transform( Functional.filter(ldm1,
                        new Functional.GreaterThan<DataManipulator1>(rf)), new Incrementor()));

        List<DataManipulator2> ldm2 = Arrays.asList(
                new DataManipulator2("a"), new DataManipulator2("B"), new DataManipulator2("c"),new DataManipulator2("d"));
        System.out.println(
                Functional.transform(ldm2, new UpperCaseConverter())); System.out.println(Functional.reduce(ldm2,
                new Concatenator()).getValue());
    }
}
