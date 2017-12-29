package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/27.
 */

import java.util.*;


/**
 * @author:Administrator
 * @date:2017/12/27
 * @description:
 */
class SimpleHashMap5<K,V> extends AbstractMap<K,V>{
    static class Entry<K,V> implements Map.Entry<K,V> {
        private K key; private V value; Entry<K,V> next;
        public Entry(K key, V value) { this.key = key;
            this.value = value;
        }
        @Override
        public K getKey() { return key; }
        @Override
        public V getValue() { return value; }
        @Override
        public V setValue(V v) {
            V result = value; value = v;
            return result;
        }
        @Override
        public int hashCode() { return key.hashCode() ^
                (value == null ? 0 : value.hashCode());
        }
        @Override
        public boolean equals(Object o) {
            if(o instanceof Entry) {
            @SuppressWarnings("unchecked")
            Entry<K,V> e = (Entry<K,V>)o;
                Object key1 =  getKey();
                Object key2 = e.getKey();
                if(key1.equals(key2)) {
                Object val1 = getValue();
                    Object val2 = e.getValue();
                    return
                        val1 == null ? val2 == null : val1.equals(val2);
            }
        }
            return false;
        }
        @Override
        public String toString() { return key + "=" + value; }
    }
    static final int SIZE = 997;
    @SuppressWarnings("unchecked")
    Entry<K,V>[] buckets = new Entry[SIZE];


    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        Entry<K,V> newPair = new Entry<K,V>(key, value);
        if(buckets[index] == null)
            buckets[index] = newPair;
        Entry<K,V> prevPair = null;
        boolean found = false;
        for(Entry<K,V> pair = buckets[index] ;
            pair != null; pair = pair.next) {
            if(pair.getKey().equals(key)) {
                oldValue = pair.getValue();
             if(prevPair != null)
                prevPair.next = newPair; else
                buckets[index] = newPair;
                newPair.next = pair.next;
                found = true;
                break;
            }
            prevPair = pair;
        }
        if(!found)
            prevPair.next = newPair;
        return oldValue;
    }
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        for(Entry<K,V> pair = buckets[index];
            pair != null;
            pair = pair.next)
            if(pair.getKey().equals(key))
                return pair.getValue(); return null;
    }
    public Set<Map.Entry<K,V>> entrySet() {
        Set<Map.Entry<K,V>> set = new HashSet<Map.Entry<K,V>>();
        for(Entry<K,V> bucket : buckets) {
        for(Entry<K,V> pair = bucket; pair != null; pair = pair.next)
            set.add(pair);
    }
        return set;
    }
    @SuppressWarnings("unchecked") public void clear() {
             buckets = new Entry[SIZE];
    }
    public V remove(Object key) {

        int index = Math.abs(key.hashCode()) % SIZE; Entry<K,V> prevPair = null;
        for(Entry<K,V> pair = buckets[index] ; pair != null;
        pair = pair.next) {
            if(pair.getKey().equals(key)) {
            V value = pair.getValue();
            if(prevPair != null)
                prevPair.next = pair.next; else
                buckets[index] = null; return value;
        }
        }
        return null;
    }
    public int size() {
         int sz = 0;
        for(Entry<K,V> bucket : buckets)
            for(Entry<K,V> pair = bucket;
                pair != null;
                pair = pair.next)
                sz++;
        return sz;
    }
    public boolean isEmpty() {
 for(Entry<K,V> bucket : buckets)
        if(bucket != null) return false;
        return true;
    }
    public boolean containsKey(Object key) {
    for(Entry<K,V> bucket : buckets) {
        for(Entry<K,V> pair = bucket; pair != null; pair = pair.next)
            if(pair.getKey().equals(key))
            return true;
    }
    return false;
}


}
public class ExTwentyFive {
}
