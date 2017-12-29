package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/28.
 */
import java.util.*;
/**
 * @author:Administrator
 * @date:2017/12/28
 * @description:
 */
class SimpleHashMap6<K,V> extends AbstractMap<K,V> {
    static final int SIZE = 997;
    @SuppressWarnings("unchecked") ArrayList<MapEntry<K,V>>[] buckets =
        new ArrayList[SIZE];
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null)
            buckets[index] = new ArrayList<MapEntry<K,V>>();
        ArrayList<MapEntry<K,V>> bucket = buckets[index];
        MapEntry<K,V> pair = new MapEntry<K,V>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K,V>> it = bucket.listIterator();
        while(it.hasNext()) {
            MapEntry<K,V> iPair = it.next(); if(iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }
        if(!found) buckets[index].add(pair);
        return oldValue;
    }
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null) return null;
        for(MapEntry<K,V> iPair : buckets[index])
            if(iPair.getKey().equals(key))
                return iPair.getValue();
        return null;
    }
    public Set<Map.Entry<K,V>> entrySet() {
        Set<Map.Entry<K,V>> set= new HashSet<Map.Entry<K,V>>();
        for(ArrayList<MapEntry<K,V>> bucket : buckets) {
        if(bucket == null) continue;
            for(MapEntry<K,V> mpair : bucket)
            set.add(mpair);
    }
        return set;
    }
    @SuppressWarnings("unchecked")
    public void clear() {
    buckets = new ArrayList[SIZE];
    }
    public V remove(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null) return null;
        Iterator<MapEntry<K,V>> it = buckets[index].iterator();
        while(it.hasNext()) {
            MapEntry<K,V> iPair = it.next(); if(iPair.getKey().equals(key)) {

                V value = iPair.getValue();
             it.remove();
                return value;
            }
        }
        return null;
    }
    public int size() {
         int sz = 0;
        for(ArrayList<MapEntry<K,V>> bucket : buckets)
            if(bucket != null)
            sz += bucket.size(); return sz;
    }
    public boolean isEmpty() {
     for(ArrayList<MapEntry<K,V>> bucket : buckets)
        if(bucket != null) return false;
        return true;
    }
    public boolean containsKey(Object key) {
     for(ArrayList<MapEntry<K,V>> bucket : buckets) {
        if(bucket == null) continue;
         for(MapEntry<K,V> mPair : bucket)
            if(mPair.getKey().equals(key)) return true;
    }
    return false;
}
}

public class ExThirtySeven {
}
