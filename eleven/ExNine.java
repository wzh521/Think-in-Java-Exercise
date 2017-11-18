package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/18.
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author:Administrator
 * @date:2017/11/18
 * @description:
 */
class Sequence2  { private Object[] items; private int next;
    public Sequence2(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length) {
            items[next++] = x;
        }
    }
    private class SequenceIterator implements Iterator<Object> {
        private int i;
        @Override
        public boolean hasNext() { return i < items.length; }
        @Override
        public Object next() {
            if(hasNext()){
                return items[i++];}
            throw new NoSuchElementException();
        }
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    public Iterator<Object> iterator() { return new SequenceIterator();
    }
}
public class ExNine {
    public static void main(String[] args) {
        Sequence2 sequence = new Sequence2(10);
        for(int i = 0; i < 10; i++){
            sequence.add(Integer.toString(i));
        }
        Iterator<Object> iterator = sequence.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
