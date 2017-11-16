package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */
interface Selector{
    boolean end();
    Object current();
    void next();
}
class Sequence {
    private Object[] items;
    private int next =0;
    public Sequence(int n){
        items = new Object[n];
    }
    public void add(Object x){
        if(next < items.length){
            items[next++] = x;
        }
    }
    private class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length){
                i++;
            }
        }
        public Sequence getSequence(){
            return Sequence.this;
        }
        public Sequence sequence() { return Sequence.this; }


    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public boolean check(){
        return
                this == ((SequenceSelector)selector()).getSequence();
    }
    private class ReverseSelector implements Selector {
        int i = items.length - 1;
        @Override
        public boolean end() { return i < 0; }
        @Override
        public Object current() { return items[i]; }
        @Override
        public void next() { if(i >= 0) {i--;} }
    }
    public Selector reverseSelector() {
        return new ReverseSelector();
    }
}
class Test{
    private static int count = 0;
    private String s = "test"+ count++;
    @Override
    public String toString(){
        return s;
    }
}
public class ExTwo {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);
        for(int i=0;i<5;i++){
            sequence.add(new Test());
        }
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
