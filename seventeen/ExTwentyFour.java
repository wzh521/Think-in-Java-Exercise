package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/27.
 */

import java.util.AbstractSet;
import java.util.*;

/**
 * @author:Administrator
 * @date:2017/12/27
 * @description:
 */
class SimpleHashSet<K> extends AbstractSet<K>{
    private final static int SIZE = 997;
    @SuppressWarnings("unchecked")
    private LinkedList<K>[] buckets = new LinkedList[SIZE];
    public boolean add(K key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null)
            buckets[index] = new LinkedList<K>();
        LinkedList<K> bucket = buckets[index];
        ListIterator<K> it = bucket.listIterator();
        while(it.hasNext())
            if(it.next().equals(key))
                return false;
        it.add(key);
        return true;
    }
    public boolean contains(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null) return false;
        Iterator<K> it = buckets[index].iterator();


        while(it.hasNext())
            if(it.next().equals(key))
            return true; return false;
    }
    public int size() {
        int sz = 0;
        for(LinkedList<K> bucket : buckets) {
            if(bucket != null)
            sz += bucket.size();
        }
        return sz;
    }
    public Iterator<K> iterator() { return new Iterator<K>() {
        private int count;
        private boolean canRemove; private int index1, index2;
        public boolean hasNext() { return count < size(); } public K next() {
            if(hasNext()) { canRemove = true;
                ++count;
                for(;;) {
             while(buckets[index1] == null)
                    ++index1;
                 try {
                    return buckets[index1].get(index2++);
                } catch(IndexOutOfBoundsException e) {
// Continue search from the next bucket
                    ++index1; index2 = 0;
                }
            }
        }
        throw new NoSuchElementException();
    }
        @Override
    public void remove() {
        if(canRemove) {
        canRemove = false;
            buckets[index1].remove(--index2);
        if(buckets[index1].isEmpty())
             buckets[index1++] = null;
            --count;
    } else
        throw new IllegalStateException();
    }
};
}
}
public class ExTwentyFour {
    public static void main(String[] args) {
        SimpleHashSet<String> set = new SimpleHashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");
        System.out.println(set);
    }
}
