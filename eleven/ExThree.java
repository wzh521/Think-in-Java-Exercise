package com.wzh.thik.in.java.eleven;/**
 * Created by Administrator on 2017/11/17.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Administrator
 * @date:2017/11/17
 * @description:
 */
interface Selector{
    boolean end();
    Object current();
    void next();
}
class UnlimitedSequence {
    private final List<Object> items = new ArrayList<Object>();


    public void add(Object x) {
        items.add(x);
    }
    private class SequenceSelector implements Selector {
        private int i;
        @Override
        public boolean end() {
            return i == items.size();
        }
        @Override
        public Object current() {
            return items.get(i);
        }
        @Override
        public void next() {
            if(i < items.size()) {
                i++;
            }
        }
    }
    public Selector selector() { return new SequenceSelector();
    }
}
public class ExThree {
    public static void main(String[] args) {
        UnlimitedSequence sequence = new UnlimitedSequence();
        for(int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " "); selector.next();
        }
    }
}
